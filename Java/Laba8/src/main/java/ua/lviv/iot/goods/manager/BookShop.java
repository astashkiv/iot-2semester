package ua.lviv.iot.goods.manager;

import ua.lviv.iot.goods.enums.CategoryEnum;
import ua.lviv.iot.goods.goods.Good;
import ua.lviv.iot.goods.persistence.dao.GoodsDao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookShop implements Serializable {

    private static final long serialVersionUID = 1L;

    public GoodsDao goodsDao;

    private static Map<Integer, Good> goodsMap = new HashMap<>();

    public BookShop(ArrayList<Good> goods) {
    }

    public Map<Integer, Good> getGoodsMap() {
        return goodsMap;
    }

    public void setGoodsMap(Map<Integer, Good> goodsList) {
        BookShop.goodsMap = goodsList;

    }

    public Good getGood(Integer id) {
        return goodsDao.findById(id);
    }

    public final void addGood(final Good newGood) {
        goodsDao.persist(newGood);
    }

    public  void updateGood(Good newGood) {
        goodsDao.update(newGood);
    }

    public  void deleteGood(Integer id) {
        goodsDao.delete(id);
    }


    public Map<Integer, Good> searchByCategory(CategoryEnum categoryEnum) {
        Map<Integer, Good> listInput = new HashMap<>();
        for (Map.Entry<Integer, Good> goods : goodsMap.entrySet()) {
            if (goods.getValue().categoryEnum == categoryEnum) {
                listInput.put(goods.getValue().getId(), goods.getValue());
            }
        }
        return listInput;
    }
}