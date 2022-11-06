from models.delayModel import delayModel
import json
import time
import datetime

class DelayUpdate :
    def __init__(self) :
        self.delaymodel = delayModel()
        self.initalize()

    def initialize() :
        self.delayInfo = {
            "예정":{}
            "진행중"{}
            "종료":{}
            "오래됨":{}
        }

    def requstDelayInfo(self,data) :
        with open("SSUbway_2022/AIcon_server/delayData.json","rt" , encoding= "UTF8") as f :
            delayData = json.load(f)




