import java.util.LinkedList;
import java.util.List;

public class HypermarketManager {
    List<Good> goods = new LinkedList<>();

    public List<Good> getGood() {
        return goods;
    }

    public void addGood(final Good newGood) {
        goods.add(newGood);

    }

    public List<Good> showGood() {
        List<Good> result = new LinkedList<>();
        for (Good good : goods) {
            result.add(good);
        }
        return result;
    }

    public List<Good> find(String type, double price) {
        List<Good> result = new LinkedList<>();
        for (Good good : goods) {
            if (good.getType() == type
                    && good.getPrice() < price) {
                result.add(good);

            }

        }
        return goods;
    }
}
