from distutils.command.config import config
import pyrebase
import json

with open("SSUbway_2022/AIcon_server/auth/firebaseAuth.json") as f:
    config = json.load(f)


with open("SSUbway_2022/AIcon_server/models/lin7Station.json" ,"rt" , encoding= "UTF8") as f:
    stationinfo = json.load(f)

firebase = pyrebase.initialize_app(config)
db = firebase.database()

station = db.child("StationInfo").child("7호선").update(stationinfo)

