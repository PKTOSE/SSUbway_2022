# Main App
import time
from metroAPI import MetroAPI
from DelayUpdate import DelayUpdate
from loger import log
import random
from apscheduler.schedulers.background import BackgroundScheduler



def MetroUpdate() :
    Metro = MetroAPI()
    i = random.randrange(0,2)
    if Metro.run(i):
        print(f"Fire Base Updated - API CODE {0} | [time] "
          , str(time.localtime().tm_hour) + ":"
          + str(time.localtime().tm_min) + ":"
          + str(time.localtime().tm_sec))
        log(f"Fire Base Updated, API CODE {0}")

    else:
        print("Wait for 1hour to start sub | [time] "
          , str(time.localtime().tm_hour) + ":"
          + str(time.localtime().tm_min) + ":"
          + str(time.localtime().tm_sec))
        log("Wait for 1hour to start subway")
         

def Delay() :
    Delay = DelayUpdate()
    if Delay.run() :
        print("Delay Info updated | [time] "
          , str(time.localtime().tm_hour) + ":"
          + str(time.localtime().tm_min) + ":"
          + str(time.localtime().tm_sec))
        log("Delay Info updated")
   
    else :
        print("Delay update error! Please check. | [time] "
          , str(time.localtime().tm_hour) + ":"
          + str(time.localtime().tm_min) + ":"
          + str(time.localtime().tm_sec))
        log("Delay update error! Please check.")
    

if __name__ =="__main__":
    sched = BackgroundScheduler()
    sched.start()
    
    sched.add_job(MetroUpdate , 'interval' , seconds = 20 , id = "process_1")
    sched.add_job(Delay , 'interval' , minutes = 10 , id = "process_2")  
    while True :
        # print("Running main process | [time] "
        #   , str(time.localtime().tm_hour) + ":"
        #   + str(time.localtime().tm_min) + ":"
        #   + str(time.localtime().tm_sec))
        time.sleep(1)
