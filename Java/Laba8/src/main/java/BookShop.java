import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookShop {
    public List<Good> goodsList = new LinkedList<>();

    public final List<Good> getGoodsList() {
        return goodsList;
    }

    public BookShop(List<Good> goods) {
        this.goodsList = goods;
    }

    public List<Good> getGoods() {
        return goodsList;
    }

    public void setGoods(List<Good> goods) {
        this.goodsList = goods;
    }

    /**
     * Add decoration to decoration's list
     *
     * @param goods object of the parent class of all decorations

    public final void addGood(final Good decoration) {
        this.goods.add(goods);
    }*/

    public void sortByPages(List<Good> goods) {
        goods.sort(Comparator.comparingInt(Good::getPages));
    }

    public List<Good> searchByCategory(CategoryEnum categoryEnum) {
        List<Good> listInput = new ArrayList<Good>();
        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).categoryEnum == categoryEnum) {
                listInput.add(goodsList.get(i));
            }
        }
        return listInput;
    }
}
