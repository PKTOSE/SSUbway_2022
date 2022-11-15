import pyrebase
import json


def start():
  with open('/home/runner/SSUbway/serviceAccountKey.json') as f:
    config = json.load(f)

  firebase = pyrebase.initialize_app(config)
  db = firebase.database()

  datas = db.child("DelayInfo").get()
  datas = datas.val()  # ordered dict 반환
  datas = list(datas.items())  # ordered dict to list

  # print(datas[0][-1]['line'])

  return datas


def get_delay_info_from_line(line: str) -> list:
  delay_data = start()
  return_data_list = list()

  for data in delay_data:
    if f"{line}호선" in data[-1]['호선']:
      return_data_list.append(data[-1])

  Total = []
  dict_keys = {'정보': "text", '시간': "time", '날짜': "date", '호선': "line"}
  for item in return_data_list:
      tmp = dict()
      for key in item:
          if key == '호선':
              lines = dict()
              for cnt, line in enumerate(item[key]):
                  lines[cnt] = line
              new_key = dict_keys[key]
              tmp[new_key] = lines
              continue
          new_key = dict_keys[key]
          tmp[new_key] = item[key]
      Total.append(tmp)
      del tmp
  
  # print(Total)
  return Total


if __name__ == '__main__':
  arr = get_delay_info_from_line("4")
  print(*(i for i in arr))
