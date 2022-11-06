from models.seatModel import seatModel
from models.subwayModel import subwayModel
import json
import time
import requests
from loger import log
import datetime

class MetroAPI :
    def __init__(self) :
        self.auth = []
        with open("SSUbway_2022/AIcon_server/auth/metroAuth.json") as f :
            self.auth = json.load(f)["authKey1"] #인증키 받기

        self.lines = [7,]
        self.subModel = subwayModel()
        self.seatModel = seatModel()
        self.initialize()

    def initialize(self) :
        self.location = {
            "7호선":{
                "상행":{},
                "하행":{}
            }
        }

    def makeURL(self,line,keyIndex) :
        """API 활용을 위한 URL로 변경"""
        return f"http://swopenAPI.seoul.go.kr/api/subway/{self.auth[keyIndex]}/json/realtimePosition/0/100/{line}호선"

    def requestURL(self,url) :
        """API 서버에 데이터 호출"""
        print(requests.get(url))
        return dict(requests.get(url).json())["realtimePositionList"]

    def parse(self,locationData) :
        trainId = locationData["trainNo"] #지하철 ID
        line = locationData["subwayNm"] # 호선
        station = locationData["statnNm"] #현재 위치하고 있는 역
        trainStatus = locationData["trainSttus"] #열차 출발 여부
        statusList = ["진입", "도착", "출발"]
        finalDestination = locationData["statnTnm"] # 종착역
        updown = locationData["updnLine"] #상행 하행 여부 (0 상행, 1 하행)
        updownList = ["상행", "하행"]
        updatedData = {
            "현재역":station,
            "열차출발여부":statusList[int(trainStatus)],
            "종착역": finalDestination
        }
        
        self.location[line][updownList[int(updown)]][trainId] = updatedData
    
    def parseRequest(self, JSON_FILE) :
        """ 받아온 데이터를 처리 """
        subwayStatuses = JSON_FILE
        
        for status in subwayStatuses:
            self.parse(status)
        self.subModel.updateLocation(self.location)

    def train_ok(self, now):
        if now > 1 and now < 5:
            return True
        else:
            return False


    def run(self, keyIndex):
        """ 
            run을 실행하면 자동으로 API에서 데이터를 받아와
            데이터베이스에 저장할 수 있도록함
            
        """
        self.initialize()
        self.subModel.remove()
        now = (datetime.datetime.now().hour)
        if self.train_ok(now):
            return False

        for line in self.lines:
            URL = self.makeURL(line, keyIndex)
            print(URL)
            try:
                REQUESTED_JSON = self.requestURL(URL)
                self.parseRequest(REQUESTED_JSON)
                #self.seatModel.update()
                return True

            except:
                log("Subway Time Done or Error")
                return False
        
        


if __name__ == "__main__":
    MetroAPI().run(0)