from goods.Good import Good


class Book(Good):
    def __init__(self, name, category, price, author, pages):
        super().__init__(name, category, price, author, pages)

    def __str__(self):
        return ", Name:" + str(self.name) + " Category: " + str(self.category) + ", Price:" + str(
            self.price) + ", Author:" + str(self.author) + ", Pages:" + str(self.pages)

