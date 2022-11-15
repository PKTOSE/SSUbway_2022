from models.delayModel import delayModel
import json

class DelayUpdate :
    def __init__(self) :
        self.delaymodel = delayModel()
        self.initialize()

    def initialize(self) :
        self.delayInfo = {
            
        }

    # def requstDelayInfo(self,data) :
    #     with open("SSUbway_2022/AIcon_server/delayData.json","rt" , encoding= "UTF8") as f :
    #         delayData = json.load(f)

    def parse(self,delayData) :
        date = delayData["date"]
        time = delayData["time"]
        text = delayData["text"]
        line = delayData["line"]
        updatedData = {
            "정보" : text,
            "호선" : line,
            "시간" : time,
            "날짜" : date
        }
        if date == "None" :
            self.delayInfo["기타"] = updatedData
        else :
            self.delayInfo[date] = updatedData

    def parseRequest(self , JSON_FILE) :
        delaySatuses = JSON_FILE

        for infos in delaySatuses :
            self.parse(infos)
        self.delaymodel.updateDelayInfo(self.delayInfo)

    def run(self) :
        """
        run을 실행하면 자동으로 지연정보가 올려지도록
        """
        self.initialize()
        self.delaymodel.remove()
        
        with open("./AIcon_server/delayData.json","rt" , encoding= "UTF8") as f :
            JSON_FILE = json.load(f)
        try :
            self.parseRequest(JSON_FILE)
            #print("Updated")
            return True
        except :
            print("error")
            False





if __name__ == "__main__" :
    testInstance = DelayUpdate()
    testInstance.run()