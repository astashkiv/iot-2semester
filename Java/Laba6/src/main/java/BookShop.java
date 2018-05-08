import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookShop {
    private List<Good> goods;

    public BookShop(List<Good> goods) {
        this.goods = goods;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    public void sortByPages(List<Good> goods) {
        goods.sort(Comparator.comparingInt(Good::getPages));
    }

    public List<Good> searchByCategory(CategoryEnum categoryEnum) {
        List<Good> listInput = new ArrayList<Good>();
        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).categoryEnum == categoryEnum) {
                listInput.add(goods.get(i));
            }
        }
        return listInput;
    }
}
