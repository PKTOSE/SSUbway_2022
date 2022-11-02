import pyrebase
import json

class subwayModel :
    """ 지하철의 위치와 현재있는 지하철을 저장하는 모델입니다. """
    def __init__(self) :
        with open("SSUbway_2022/AIcon_server/auth/firebaseAuth.json") as f:
            config = json.load(f)

        self.firebase = pyrebase.initialize_app(config)
        self.db = self.firebase.database()


    def remove(self) :
        self.db.child("subwayLocation").remove()

    def updateLocation(self,locationData) :
       
        """
        열차의 위치 업데이트
        """
        
        self.db.child("subwayLocation").set(locationData)
    
