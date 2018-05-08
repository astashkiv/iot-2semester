class Dishes:

    total_price = 0

    def __init__(self, type="Cup", colour="Green", price=100, size=250, print1="With cat", material="ceramics"):
        self.type = type
        self.colour = colour
        self.price = price
        self.size = size
        self.print1 = print1
        self.material = material
        Dishes.total_price += self.price

    def to_string(self):
        print("Type: " + self.type + ", Colour: " + str(self.colour)
              + ", Price: " + str(self.price) + "Size: " + str(self.size)
              + ", Print: " + str(self.print1) + "Material:" + str(self.material))

    def print_sum(self):
        print("This " + self.type + " is " + str(self.colour) + " colour")

    @staticmethod
    def print_static_sum():
        print("Total price of all dishes = " + str(Dishes.total_price))


if __name__ == "__main__":
    cup = Dishes()
    plate = Dishes("Plate", "Green", 80, "Flowers", "plastic", 100)
    kettle = Dishes("Kettle", "Red", 150, "Dots", "metal", 500)
    cup.to_string()
    plate.to_string()
    kettle.to_string()
    Dishes.print_static_sum()
    plate.print_sum()
    kettle.print_sum()