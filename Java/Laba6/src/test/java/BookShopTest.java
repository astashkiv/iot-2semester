import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookShopTest {
    private Book harryPotter;
    private Book one;
    private Book crucible;
    private Calendar newYear;
    private Sketchbook miffBook;
    private ArrayList<Good> goods;
    private BookShop bookShop;

    @BeforeEach
    void setUp() {
        harryPotter = new Book("Harry Potter", CategoryEnum.FICTION, true, 150, "J.K. Roaling", 1);
        one = new Book("1984", CategoryEnum.FICTION, true, 200, "J. Orvell", 1);
        crucible = new Book("The Crusible", CategoryEnum.FICTION, true, 180, "A. Miller", 1);
        newYear = new Calendar("New Year Calendar", CategoryEnum.CALENDAR, false, 20, "2018-2020", 1);
        miffBook = new Sketchbook("Miff", CategoryEnum.DRAWING, true, 70, "Black", 1);
        goods = new ArrayList<>();
        goods.add(harryPotter);
        goods.add(one);
        goods.add(crucible);
        goods.add(newYear);
        goods.add(miffBook);
        bookShop = new BookShop(goods);
    }

    @Test
    void sortByPagesTest() {
        ArrayList<Good> goodsTest = new ArrayList<>();
        goodsTest.add(harryPotter);
        goodsTest.add(one);
        goodsTest.add(crucible);
        goodsTest.add(newYear);
        goodsTest.add(miffBook);
        bookShop.sortByPages(goods);
        assertEquals(goodsTest, goods);
    }


    @Test
    void searchByCategory() {
        List<Good> goodsTest = new ArrayList<>();
        goodsTest.add(harryPotter);
        goodsTest.add(one);
        goodsTest.add(crucible);
        goodsTest.add(newYear);
        goodsTest.add(miffBook);
        bookShop.searchByCategory(CategoryEnum.FICTION);
        assertEquals(goodsTest, goods);
    }

}