from goods.Good import Good


class Sketchbook(Good):
    def __init__(self, name, category, price, colour, pages):
        super().__init__(name, category, price, colour, pages)
        self.colour = colour

    def __str__(self):
        return ", Name:" + str(self.name) + " Category: " + str(self.category) + ", Price:" + str(
            self.price) + ", Colour:" + str(self.colour) + ", Pages:" + str(self.pages)

