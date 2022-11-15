# SSUbway_2022
<img src="https://img.shields.io/github/issues-pr-raw/PKTOSE/SSUbway_2022"> <img src="https://img.shields.io/github/issues-pr-closed-raw/PKTOSE/SSUbway_2022"> <img src="https://img.shields.io/github/forks/PKTOSE/SSUbway_2022"> <img src="https://img.shields.io/github/stars/PKTOSE/SSUbway_2022"> <img src="https://img.shields.io/github/license/PKTOSE/SSUbway_2022"> <img src="https://img.shields.io/badge/Python-3776AB?style=flat&logo=Python&logoColor=white"/>
<img src="https://img.shields.io/badge/Kotlin-7F52FF?style=flat&logo=Kotlin&logoColor=FFFFFF"/>

2022년도 2학기 AI융합학부 AI경진대회

### TimeLine
> - 11-01: 깃허브 개설 
> - 11-03: 서울 메트로에서 지하철 지연 공지에 대한 공지사항을 가져와 시간, 요일, 구분
> - 11-06: 구글 파이어베이스에 지연 정보 업로드
> - 11-13: 코틀린 기반 안드로이드 앱 뼈대 업로드
> - 11-14: 서울 메트로 트위터 타임라인에서 지연정보 추출하는 클래스 파일 생성


## 수정해야 할점
line7Station.json이 gitignore때문에 숨김처리 되어서 새로운 작업환경에서 깃 클론을 땡길 시 파일이 없어서 오류가 남.   
현재 깃이그노어에 예외처리 해놓긴 했는데 line7Station.json파일을 다시 올려야 할 듯 함.   

## 가상환경 설정시   
가상환경 설정시 시작 점을 SSUbway 폴더로 잡을 것. 안그러면 에러남.   
pipenv 설치법...   
cmd 혹은 콘솔창에 *pip install pipenv* 입력   
그러면 설치끝   
그 후 SSUbway 로컬 폴더로 이동, 그 안에 AIcon_server로 이동하면 pipfile이 있음(cd를 이용하여 이동함~)   
pipfile 은 프로젝트에 사용한 패키지,파이썬 버전등을 담은 파일임...   
AIcon_server 폴더로 이동한 상태에서 *pipenv install* 입력...
그러면 패키지,파이썬, 가상환경 설정이 끝남...   
vscode 이용시 ctrl + shift + p 를 통해 python Interpreter 설정에서 새로 만든 가상환경 파이썬 인터프리터 설정....   
그 후 작업을 시작하면 됨.

## TweepScrap
Twitter API 사용을 위한 tweepy 설치 필요
```angular2html
pip install tweepy
pip install python-dotenv
```
API에 대한 토큰이 담긴 .env파일이 필요함 (아래 부분에서 사용을 위해)
```python
# 트위터 API 호출을 위한 토큰
self.bearer_token = os.environ.get("bearer_token")
self.consumer_key = os.environ.get("consumer_api_key")
self.consumer_secret = os.environ.get("consumer_api_secret")
self.access_token = os.environ.get("access_token")
self.access_token_secret = os.environ.get("access_token_secret")
```
