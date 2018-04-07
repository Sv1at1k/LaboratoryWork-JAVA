package main;

import java.util.LinkedList;
import java.util.List;

public class HypermarketManager {

    private List<Good> goods = new LinkedList<>();

    public List<Good> getGoods() {
        return goods;
    }

    public void addGood(final Good newGood) {
        goods.add(newGood);

    }

    public List<Good> showItems() {
        System.out.println("Goods list:");
        List<Good> result = new LinkedList<>();
        for (Good hypermarket : goods) {
            result.add(hypermarket);

        }
        return result;

    }


    public List<Good> whatCanIBuy(Integer price) {
        List<Good> result = new LinkedList<>();
        for (Good hypermarket : goods) {
            if (hypermarket.getPrice() < price) {
                result.add(hypermarket);
            }

        }
        return result;
    }

    public List<Good> find(String key) {
        List<Good> result = new LinkedList<>();
        for (Good good : goods) {
            if (good.getName() == key
                    || good.getManufacturer() == key
                    || good.getMaterial() == key
                    ) {
                result.add(good);

            }

        }
        return result;
    }

}
