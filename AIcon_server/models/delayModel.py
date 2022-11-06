import pyrebase
import json

class delayModel :
    """ 지하철의 지연 정보를 입력하는 모델입니다."""
    def __init__(self) :
        with open("SSUbway_2022/AIcon_server/auth/firebaseAuth.json") as f:
            config = json.load(f)

        self.firebase = pyrebase.initialize_app(config)
        self.db = self.firebase.database()

    def remove(self) :
        self.db.child("DelayInfo").remove()

    def updateDelayInfo(self,delayData):
        """
        지연 정보 업데이트
        """
        self.db.child("DelayInfo").set(delayData)
    

