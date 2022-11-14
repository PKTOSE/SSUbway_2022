import tweepy
import os
from dotenv import load_dotenv
import datetime

tzone = datetime.timezone(datetime.timedelta(hours=9))
now = datetime.datetime.now(tz=tzone)
load_dotenv()


class TweetScrap:  # 서울 메트로 트위터 타임라인을 가져오는 클래스, iterable 함
    # 기본적인 기능들은 객체 외부에서 접근 불가능 하도록 함수 이름을 __로 시작함
    def __init__(self):
        self.ids: int = 64331888  # 서울 메트로 트위터 아이디
        '''
        트위터 API 호출을 위한 토큰
        '''
        self.bearer_token = os.environ.get("bearer_token")
        self.consumer_key = os.environ.get("consumer_api_key")
        self.consumer_secret = os.environ.get("consumer_api_secret")
        self.access_token = os.environ.get("access_token")
        self.access_token_secret = os.environ.get("access_token_secret")

        self.__get_apis()  # API 호출
        self.tweet_timeline = list()  # 타임라인을 가져와 저장할 리스트
        self.__get_tweets()  # 타임라인에 있는 트윗 가져오는 함수
        self.current: int = 0
        self.stop: int

    def __get_apis(self):  # 트위터 API 호출
        self.api = tweepy.Client(bearer_token=self.bearer_token,
                                 consumer_key=self.consumer_key,
                                 consumer_secret=self.consumer_secret,
                                 access_token=self.access_token,
                                 access_token_secret=self.access_token_secret)

    def __get_tweets(self):  # 서울 메트로의 타임라인 가져오기
        ids: int = self.ids
        tweets = self.api.get_users_tweets(ids)
        self.tweet_timeline += list(tweets.data)
        self.stop = len(self.tweet_timeline)  # iter 에서 종단점 설정
        return self.tweet_timeline

    def show_tweets(self):  # 저장된 데이터 보여줌
        return self.tweet_timeline

    def __iter__(self):  # 이터러블 객체를 만들어줌
        return self

    def __next__(self):
        if self.current < self.stop:
            r = self.tweet_timeline[self.current]
            self.current += 1
            return r
        else:
            self.current = 0
            raise StopIteration

    def __getitem__(self, item):  # 데이터를 인덱스로 접근 가능하게 해줌
        return self.tweet_timeline[item]


class TwitterNotice:  # 서울메트로의 트윗에서 데이터 분리
    # 기본적인 기능들은 객체 외부에서 접근 불가능 하도록 함수 이름을 __로 시작함
    def __init__(self, seoul_metro_tweet):
        self.tweet = seoul_metro_tweet
        self.__save_data = dict()  # 모든 데이터를 저장할 변수, 'text': 전문, 'date': 월 일, 'time': 시간, 'line': 해당 호선들
        self.__set_data()

    def __set_data(self):  # 데이터 저장을 해주는 함수들을 한번에 실행
        self.__save_data['text'] = str(self.tweet)
        self.__set_dates(str(self.tweet))
        self.__set_time(str(self.tweet))
        self.__set_lines(str(self.tweet))

    def __set_dates(self, twts: str):  # 텍스트에서 날짜를 찾아 데이터에 저장
        if '오늘' in twts:
            # print('오늘 found!')
            idx = twts.find('오늘')
            date = twts[idx + 3:idx + 6]
            filtered_date = ''
            for i in date:
                if i in ['(', ')', ' ']:
                    continue
                filtered_date += i
            month = datetime.datetime.now(tz=tzone)
            month = month.strftime("%m월")
            filtered_date = f'{month} {filtered_date}'
            self.__save_data['date'] = filtered_date
        else:
            date = 'None'
            self.__save_data['date'] = date

    def __set_time(self, twts: str):  # 텍스트에서 시, 분을 찾아 저장함
        time = ''
        min = ''
        cnt_time = 0
        cnt_min = 0
        for i in range(25):
            idx: int
            if f"{i}시" in twts:
                idx = twts.find(f"{i}시")
                try:
                    if '시' == twts[idx + 2]:
                        raise
                    hour = str(int(twts[idx - 1:idx + 1])) + '시'
                    if twts[idx + 2] == '~':
                        hour = str(twts[idx - 1:idx + 1]) + '시~' + str(twts[idx + 3:idx + 6])
                except:
                    hour = twts[idx:idx + 2]
                if cnt_time != 0:
                    if (twts[idx + 3] != ' ') and ('시' in hour):
                        time += ', '
                if hour not in time:
                    time += hour
                cnt_time += 1

        for j in range(60):
            idx: int
            if f"{j}분" in twts:
                idx = twts.find(f"{j}분")
                try:
                    if '분' == twts[idx + 2]:
                        raise
                    minutes = str(int(twts[idx - 1:idx + 1])) + '분'
                except:
                    minutes = twts[idx:idx + 3]
                if cnt_min != 0:
                    min += "~"
                if minutes not in min:
                    min += minutes
                cnt_min += 1
        time += min
        if time == '':
            time = 'None'
        self.__save_data['time'] = time

    def __set_lines(self, twts: str):  # 텍스트에서 해당하는 호선들을 찾아 저장함
        line = list()
        for i, txt in enumerate(twts):
            try:
                check_is_line = str(twts[i] + twts[i + 1])
            except IndexError:
                check_is_line = 'None'
            if check_is_line == "호선":
                apply_line = str(twts[i - 1] + "호선")
                line.append(apply_line)
        line = sorted(list(set(line)))
        self.__save_data['line'] = line

    def show_data(self):
        return self.__save_data


if __name__ == "__main__":
    tweets = TweetScrap()
    datas = []
    for i, tweet in enumerate(tweets):
        datas.append(TwitterNotice(tweet))
        print(f'{i + 1}: {datas[i].show_data()["line"]}')
    # print(f"{TwitterNotice(tweets[-1]).show_data()}")
