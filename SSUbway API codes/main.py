from handle_firebase import get_delay_info_from_line as delay
from flask import Flask, render_template, request
from flask_cors import CORS
import random
import json

app = Flask(
  __name__,
  template_folder='templates',  # html 파일 폴더 경로
  static_folder='static',  # static 파일 폴더 경로
)
CORS(app)


@app.route('/')
def index():
  return render_template('base.html')


@app.route('/delay', methods=['GET'])
def no1():
  delay_line = "4"
  line = request.args.get('line', default = 1, type = int)
  txt = delay(str(line))
  # print(txt)
  result = dict()
  for cnt, data in enumerate(txt):
    result[cnt] = data
  print(result)
  return render_template('no1.html', delay_info=result, delay_line=line)
  # return json.dumps(txt)

@app.route('/apis/delay', methods=['GET'])
def handel_get_methods():
  line = request.args.get('line', default = 1, type = int)
  txt = delay(str(line))
  result = dict()
  for cnt, data in enumerate(txt):
    result[cnt] = data
  result = json.dumps(result, ensure_ascii=False).encode('utf8')
  # print(type(result))
  return result

if __name__ == "__main__":
  app.run(host='0.0.0.0', port=random.randint(2000, 9000))
