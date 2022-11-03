from scrapper import Notice
import datetime
import requests
from bs4 import BeautifulSoup as bs

basicUrl = 'http://www.seoulmetro.co.kr/kr/board.do?menuIdx=546'  # 공지사항 게시판 링크
alphaUrl = '&bbsIdx='  # 공지사항 개시글 링크
articleNum = '2214690'
#  URL = basicUrl + alphaUrl + articleNum 방식임

response = requests.get(basicUrl)
soup = bs(response.text, 'html.parser')
td_title = soup.find_all('td', class_="td-lf bd2")
soup = bs(str(td_title), 'html.parser')
a_href_title = soup.find_all('a')

'''
공지사항 1페이지에서 개시글의 제목에 "지연"이 포함되는 <a href> 테그만 추출
이후 글이 있는 페이지로 넘어가기 위해 bbsIdx 넘버를 가져와 URL로 가공  
'''

delay_list = list()
for cnt, title in enumerate(a_href_title, 1):
    print(f'{cnt}. {title.string}')
    if "지연" in title.string:
        delay_list.append(cnt - 1)

delay_list_number = list()
for i in delay_list:
    # print(a_href_title[i])
    bbsIdx = ''
    txt = str(a_href_title[i])
    num = txt.find('bbsIdx')
    bbsIdx += txt[num + 7:num + 14]
    delay_list_number.append(bbsIdx)
del delay_list

URLS = list()
for i in delay_list_number:
    url = basicUrl + alphaUrl + str(i)
    URLS.append(url)
del delay_list_number

delays = list()
for i in URLS:
    board = Notice(i)
    delays.append(board)

if __name__ == "__main__":
    for i in delays:
        data = i.show_save_data()
        print(f'{data}\n')
