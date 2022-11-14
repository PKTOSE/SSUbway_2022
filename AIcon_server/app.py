# Main App
#import time
from metroAPI import MetroAPI
from DelayUpdate import DelayUpdate
from loger import log
import random


def MetroUpdate() :
    Metro = MetroAPI()
    i = random.randrange(0,2)
    if Metro.run(i):
        print(f"Fire Base Updated - API CODE {0}")
        log(f"Fire Base Updated, API CODE {0}")

    else:
        print(f"Wait for 1hour to start sub")
        log("Wait for 1hour to start subway")
         

def Delay() :
    Delay = DelayUpdate()
    if Delay.run() :
        print("Delay Info updated")
        log("Delay Info updated")
   
    else :
        print("Delay update error! Please check.")
        log("Delay update error! Please check.")
    

if __name__ =="__main__":
    while True:
        schedule.every(20).seconds.do(MetroUpdate)
        schedule.every(5).minutes.do(Delay)
        