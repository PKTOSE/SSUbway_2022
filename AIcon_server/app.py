# Main App
import time
from metroAPI import MetroAPI
from loger import log


if __name__ =="__main__":
    Metro = MetroAPI()
    while True:
        for i in range(2):
            if Metro.run(i):
                print(f"Fire Base Updated - API CODE {0}")
                log(f"Fire Base Updated, API CODE {0}")
                time.sleep(20)
            else:
                print(f"Wait for 1hour to start sub")
                log("Wait for 1hour to start subway")
                time.sleep(60 * 60)