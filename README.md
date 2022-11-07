# SSUbway_2022
2022년도 2학기 AI융합학부 AI경진대회

### TimeLine
> - 11-01: 깃허브 개설 
> - 11-03: 서울 메트로에서 지하철 지연 공지에 대한 공지사항을 가져와 시간, 요일, 구분


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
