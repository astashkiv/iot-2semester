import configparser
from flask_sqlalchemy import SQLAlchemy
from flask import Flask, jsonify, request

application = Flask(__name__)

config = configparser.ConfigParser()
config.read('iot-test-db.conf')

application.config['SQLALCHEMY_DATABASE_URI'] = 'mysql://' + config.get('DB', 'user') + \
                                                ':' + config.get('DB', 'password') + '@' + \
                                                config.get('DB', 'host') + '/' + config.get('DB', 'db')

application.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = True

mysql = SQLAlchemy()
mysql.init_app(application)


class Goods(mysql.Model):
    __tablename__ = 'good'
    id = mysql.Column(mysql.Integer, primary_key=True)
    name = mysql.Column(mysql.String(128), nullable=False)
    category = mysql.Column(mysql.String(128), nullable=False)
    price = mysql.Column(mysql.Integer, nullable=False)
    author = mysql.Column(mysql.String, nullable=False)
    page = mysql.Column(mysql.Integer, nullable=False)

    def __repr__(self):
        return '<Goods (%s, %s, %s, %s) >' % (self.name, self.category, self.price, self.author, self.page)


@application.route("/")
def hello():
    return "Hello World!"


@application.route('/good', methods=['POST'])
def create_good():
    id = request.get_json()["id"]
    name = request.get_json()["name"]
    category = request.get_json()["category"]
    price = request.get_json()["price"]
    author = request.get_json()["author"]
    page = request.get_json()["page"]
    curr_session = mysql.session

    good = Goods(id=id, name=name, category=category, price=price, author=author, page=page)

    try:
        curr_session.add(good)
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    good_id = good.id
    data = Goods.query.filter_by(id=good_id).first()

    config.read('iot-test-db.conf')

    result = [data.name, data.category, data.price, data.author, data.page]

    return jsonify(session=result)


@application.route('/good', methods=['PATCH'])
def update_good(good_id):
    global good
    id = request.get_json()["id"]
    name = request.get_json()["name"]
    category = request.get_json()["category"]
    price = request.get_json()["price"]
    author = request.get_json()["author"]
    page = request.get_json()["page"]
    curr_session = mysql.session

    try:
        good = Goods.query.filter_by(id=good_id).first()
        good.name = name
        good.category = category
        good.price = price
        good.author = author
        good.page = page
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    good_id = good.id
    data = Goods.query.filter_by(id=good_id).first()

    config.read('iot-test-db.conf')

    result = [data.name, data.category, data.price, data.author, data.page]

    return jsonify(session=result)

@application.route('/good/<int:good_id>', methods=['GET'])
def get_good():
    data = Goods.query.all()

    data_all = []

    for good in data:
        data_all.append([good.id, good.name, good.category, good.price, good.author, good.page])

    return jsonify(goods=data_all)


@application.route('/good/<int:good_id>', methods=['DELETE'])
def delete_good(good_id):
    curr_session = mysql.session

    Goods.query.filter_by(id=good_id).delete()
    curr_session.commit()

    return get_good()

if __name__ == "__main__":
    application.run()