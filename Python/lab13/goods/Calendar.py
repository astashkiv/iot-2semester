from goods.Good import Good


class Calendar(Good):
    def __init__(self, name, category, price, year, pages):
        super().__init__(name, category, price, year, pages)
        self.year = year

    def __str__(self):
        return ", Name:" + str(self.name) + " Category: " + str(self.category) + ", Price:" + str(
            self.price) + ", Year:" + str(self.year) + ", Pages:" + str(self.pages)

