import requests
from bs4 import BeautifulSoup as bs


class Notice:  # 지하철 지연 안내
    def __init__(self, urls):
        self.urls = urls
        self.response = requests.get(urls)
        self.soup = bs(self.response.text, 'html.parser')
        self.elements = self.soup.select(
            "#board-top > article > div > table > tbody > tr:nth-child(3) > td > div.textarea-area > article > div")
        self.__save_data = dict()  # 'text': 공지사항 전문, 'date': 날짜, 'time': 시작 시간, 'info': list 타입 / 따옴표 안의 내용
        self.__start()

    def __call__(self):
        pass

    def __start(self):
        self.__date()
        self.get_all()
        self.check_info()
        self.subway_line()

    def show_save_data(self):
        return self.__save_data

    def get_all(self):
        self.__save_data['text'] = self.__tag_strip(self.elements)
        return self.__save_data['text']

    def __tag_strip(self, data) -> str:  # 가져온 텍스트 html 테그들 제거함
        data = data[0]
        text = ''
        include = True  # 테그 진입시 text 에 추가 하지 않도록 함.

        for i in str(data):
            if i == '<':
                include = False
            if include:
                text += i
            if i == '>':
                include = True
        return text.strip()

    def __date(self):  # 공지할 기간
        date_weekday = self.soup.select(
            "#board-top > article > div > table > tbody > tr:nth-child(3) > td > div.textarea-area > article > div > "
            "p:nth-child(2) > b > span > span:nth-child(1)")
        date_time = self.soup.select(
            "#board-top > article > div > table > tbody > tr:nth-child(3) > td > div.textarea-area > article > div > "
            "p:nth-child(2) > b > span > span:nth-child(2)")
        date_weekday = self.__tag_strip(date_weekday)
        date_time = self.__tag_strip(date_time)
        self.__save_data['date'] = date_weekday
        self.__save_data['time'] = date_time
        return date_weekday + ' ' + date_time

    '''
    get_date는 date가 먼저 선 실행 되어야 함
    '''

    def get_date(self, datetime='all') -> str:
        if datetime == 'all':
            return self.__save_data['date'] + ' ' + self.__save_data['time']
        if datetime == 'date':
            return self.__save_data['date']
        if datetime == 'time':
            return self.__save_data['time']

    def check_info(self):
        all = self.__save_data['text']
        info = list()
        txt = ''
        include = False  # 기본은 추가 안함
        apostrophe = 0
        for i in all:
            if i == '\'':
                apostrophe += 1
                include = True
                continue
            if apostrophe == 2:
                info.append(txt)
                include = False
                txt = ''  # 임시 텍스트 초기화
                apostrophe = 0
            if include:
                txt += i
        self.__save_data['info'] = info
        return info

    def subway_line(self):
        all = list(self.__save_data['text'])
        line_num = []
        for i in range(len(all)):
            if all[i] == '호' and all[i + 1] == '선':
                line_num.append(int(all[i - 1]))
        self.__save_data['line'] = sorted(list(set(line_num)))
        return sorted(list(set(line_num)))


if __name__ == "__main__":
    url = "http://www.seoulmetro.co.kr/kr/board.do?menuIdx=546&bbsIdx=2214687"
    notice1 = Notice(url)
    info = notice1.show_save_data()
    print(f'INFO: {info["info"]}\nDate & Start time: {info["date"]} {info["time"]}\nLine number: {info["line"]}')