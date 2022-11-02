import logging
import datetime

logging.basicConfig( filename="log.log" , level = logging.INFO)

def log(logg) :
    now = datetime.datetime.now()
    nowDatetime = now.strftime('%Y-%m-%d %H:%M:%S')

    logging.info(f"| {logg} \nLogging Time: {nowDatetime}\n")