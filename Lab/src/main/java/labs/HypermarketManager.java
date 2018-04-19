package labs;

import com.google.inject.Inject;
import labs.persistence.dao.GoodDao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HypermarketManager implements Serializable {


    private static final long serialVersionUID = 1L;

    @Inject
    public GoodDao goodDao;

    private static Map<Integer, Good> houseDeviceMap =new HashMap<>();
    private List<Good> goods = new LinkedList<>();



    public HypermarketManager() {

    }

    public List<Good> getGoods() {
        return goods;
    }

    public void addGood(final Good newGood) {
        goods.add(newGood);
        goodDao.persist(newGood);

    }

    public List<Good> showItems() {
        List<Good> result = new LinkedList<>();
        for (Good hypermarket : goods) {
            result.add(hypermarket);

        }
        return result;

    }


    public List<Good> whatCanIBuy(Double price) {
        List<Good> result = new LinkedList<>();
        for (Good good : goods) {
            if (good.getPrice() > price) {
                result.add(good);
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
    public final Map<Integer, Good> getHouseDeviceMap() {
        return houseDeviceMap;
    }

    public Good getGood(Integer id) {
        return goodDao.findById(id);
    }





    public  void updateGood(Good device) {
        goodDao.update(device);
    }



    public  void deleteHouseDevice(Integer id) {
        goodDao.delete(id);
    }





}
