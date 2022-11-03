import requests
from bs4 import BeautifulSoup as bs


class Notice:
    def __init__(self, urls):
        self.urls = urls
        self.response = requests.get(urls)
        self.soup = bs(self.response.text, 'html.parser')
        self.elements = self.soup.select(
            "#board-top > article > div > table > tbody > tr:nth-child(3) > td > div.textarea-area > article > div")
        self.save_date = dict()

    def __call__(self):
        pass

    def get_all(self):
        return self.tag_strip(self.elements)

    def tag_strip(self, data):  # 가져온 텍스트 html 테그들 제거함
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

    def date(self):  # 공지할 기간
        date_weekday = self.soup.select(
            "#board-top > article > div > table > tbody > tr:nth-child(3) > td > div.textarea-area > article > div > p:nth-child(2) > b > span > span:nth-child(1)")
        date_time = self.soup.select(
            "#board-top > article > div > table > tbody > tr:nth-child(3) > td > div.textarea-area > article > div > p:nth-child(2) > b > span > span:nth-child(2)")
        date_weekday = self.tag_strip(date_weekday)
        date_time = self.tag_strip(date_time)
        self.save_date['date'] = date_weekday
        self.save_date['time'] = date_time
        return date_weekday + ' ' + date_time

    '''
    get_date는 date가 먼저 선 실행 되어야 함
    '''

    def get_date(self, datetime='all'):
        if datetime == 'all':
            return self.save_date['date'] + ' ' + self.save_date['time']
        if datetime == 'date':
            return self.save_date['date']
        if datetime == 'time':
            return self.save_date['time']


if __name__ == "__main__":
    url = "http://www.seoulmetro.co.kr/kr/board.do?menuIdx=546&bbsIdx=2214687"
    notice1 = Notice(url)
    print(notice1.get_all())
    print(notice1.date())
    url = "http://www.seoulmetro.co.kr/kr/board.do?menuIdx=546&bbsIdx=2214418"
    notice2 = Notice(url)
    print(notice2.get_all())
    print(notice2.date())
