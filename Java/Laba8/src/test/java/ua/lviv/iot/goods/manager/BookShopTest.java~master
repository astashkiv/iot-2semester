package ua.lviv.iot.goods.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.goods.enums.CategoryEnum;
import ua.lviv.iot.goods.goods.Book;
import ua.lviv.iot.goods.goods.Calendar;
import ua.lviv.iot.goods.goods.Good;
import ua.lviv.iot.goods.goods.Sketchbook;
import ua.lviv.iot.goods.writer.GoodsWriter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        harryPotter = new Book(1,"Harry Potter", CategoryEnum.FICTION, true, 150, "J.K. Roaling", 1);
        one = new Book(2,"1984", CategoryEnum.FICTION, true, 200, "J. Orvell", 1);
        crucible = new Book(3,"The Crusible", CategoryEnum.FICTION, true, 180, "A. Miller", 1);
        newYear = new Calendar(4,"New Year Calendar", CategoryEnum.CALENDAR, false, 20, "2018-2020", 1);
        miffBook = new Sketchbook(5,"Miff", CategoryEnum.DRAWING, true, 70, "Black", 1);
        goods = new ArrayList<>();
        goods.add(harryPotter);
        goods.add(one);
        goods.add(crucible);
        goods.add(newYear);
        goods.add(miffBook);
        Map<Integer, Good> goodsTest = new HashMap<>();
    }

    @Test
    void sortByPagesTest() {
        ArrayList<Good> goodsTest = new ArrayList<>();
        goodsTest.add(1, harryPotter);
        goodsTest.add(2, one);
        goodsTest.add(3, crucible);
        goodsTest.add(4, newYear);
        goodsTest.add(5, miffBook);
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

    @Test
    public void writeToFile() {
        try {
            GoodsWriter goodsWriter = new GoodsWriter();
            goodsWriter.writeToFile((List<Good>) bookShop.getGoodsMap());
        } catch (IOException e) {

            assertTrue(false);
        }
        File file = new File("goods.csv");
        assertEquals(true, file.exists());
    }
}
