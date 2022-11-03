import pyrebase
import json

class seatModel:
    """ subway위치와 현재 있는 지하철을 저장하는 모델"""
    def __init__(self):
        with open("SSUbway_2022/AIcon_server/auth/firebaseAuth.json") as f:
            config = json.load(f)

        with open("SSUbway_2022/AIcon_server/models/line7Station.json" ,"rt" , encoding= "UTF8") as f:
            self.lineinfo = json.load(f)

        self.firebase = pyrebase.initialize_app(config)
        self.db = self.firebase.database()
        
    def is_pass(self, updown, now, dst):
        if updown == "up":
            if int(self.lineinfo[now]) <= int(self.lineinfo[dst]):
                return True
            else:
                return False

        elif updown == "down":
            print(int(self.lineinfo[now]), int(self.lineinfo[dst]))
            if int(self.lineinfo[now]) >= int(self.lineinfo[dst]):
                return True
            else:
                return False

    
    def update(self):
        WHOLE_info = self.db.child("SeatStatus").get()
        for i, func_i in zip(["상행","하행"], ["up", "down"]):      
            print("Start Updated")
            try:
                
                up = WHOLE_info.val()["4호선"][i]
            except:
                print(f"{i} is in except")
                continue
            for train in up.keys():
                # print(train)
                traind = self.db.child("SubwayLocation").child("4호선").child(i).child(train).get().val()
                # traindst = traind["현재역"]
                if traind == None:
                    self.db.child("SeatStatus").child("4호선").child(i).child(train).remove()
                    continue
                else:
                    traind = traind["현재역"]
                    for block in up[train]:
                        for seat in up[train][block]:
                            seatInfo = up[train][block][seat]
                            if self.is_pass(func_i, traind, seatInfo["dst"]):
                                self.db.child("SeatStatus").child("4호선").child(i).child(train).child(block).child(seat).remove()
                    print("Seat Updated")

        

if __name__ == "__main__":
    model = seatModel()
    model.update()
