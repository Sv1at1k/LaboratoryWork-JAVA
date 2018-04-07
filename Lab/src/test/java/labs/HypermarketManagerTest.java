package labs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypermarketManagerTest {


    @Test
    void addGood() {
        Good good = new Good("tyt", "ads", "name", "material", 10, 10.0);
        HypermarketManager hm = new HypermarketManager();
  hm.addGood(good);
  assertEquals(hm.getGoods().get(0).getName(),"name");
    }

    @Test
    void showItems() {
        Good good = new Good("tyt", "ads", "name", "material", 10, 10.0);
        HypermarketManager hm = new HypermarketManager();
        hm.addGood(good);
        assertEquals("name",hm.showItems().get(0).getName());
    }

    @Test
    void whatCanIBuy() {
        Good good = new Good("tyt", "ads", "name", "material", 10, 10.0);
        HypermarketManager hm = new HypermarketManager();
        hm.addGood(good);
        assertEquals(10.0,hm.whatCanIBuy(2.0).get(0).getPrice());
    }

    @Test
    void find() {
        Good good = new Good("tyt", "ads", "name", "material", 10, 10.0);
        HypermarketManager hm = new HypermarketManager();
        hm.addGood(good);
        assertEquals(10.0,hm.find("name").get(0).getPrice());
        assertEquals(10.0,hm.find("ads").get(0).getPrice());
        assertEquals(10.0,hm.find("material").get(0).getPrice());
    }
}