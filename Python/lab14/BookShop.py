class BookShop:
    good_list = []

    def __init__(self):
        pass

    def sort_by_pages(self):
        self.good_list.sort(key=lambda goods: goods.pages)
        return self.good_list

    def find_by_category(self, category):
        found_good = []
        for good in self.good_list:
            if good.category == category:
                found_good.append(good)
        return found_good

    def print_list(self):
        for good in self.good_list:
            print(good)
        print("\n")
