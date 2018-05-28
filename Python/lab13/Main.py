from goods.Book import *
from goods.Sketchbook import *
from goods.Calendar import *
from enum_category.Category import *
from BookShop import BookShop

if __name__ == '__main__':
    book_shop = BookShop()

    harryPotter = Book("Harry Potter", Category.FICTION, 150, "J.K. Roaling", 300);
    one = Book("1984", Category.FICTION, 200, "J. Orvell", 500);
    crucible = Book("The Crusible", Category.FICTION, 180, "A. Miller", 195);
    newYear = Calendar("New Year Calendar", Category.FICTION, 20, "2018-2020", 1);
    miffBook = Sketchbook("Miff", Category.DRAWING, 70, "Black", 1);

    book_shop.good_list = [harryPotter, one, crucible, newYear, miffBook]
    print("Initial list:")
    book_shop.print_list()
    
    book_shop.good_list = (book_shop.sort_by_pages())
    print("Sorted by pages list:")
    book_shop.print_list()

    book_shop.good_list = book_shop.find_by_category(Category.FICTION)
    print("Found list:")
    book_shop.print_list()


    pass
