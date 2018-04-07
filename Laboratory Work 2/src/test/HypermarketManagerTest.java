package test;

import main.Clue;
import main.Good;
import main.Human;
import main.HypermarketManager;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HypermarketManagerTest {
 private static final Clue clue = new Clue();
 private  List<Good> test = new LinkedList<>();
 private HypermarketManager manager = new HypermarketManager();

    @Test
    public void testToString() {
        Good good = new Good();
        good.setName("arsen");
       String s =  good.toString();
        assertEquals(s,"Product name:arsen Material:null Manufacturer:unknown Price:0.0 Amount:0");


    }
    @Test
    public void showItems() {
        test.add(clue);
        test.get(0).setName("clue");
        test.get(0).setPrice(10.0);
        manager.addGood(test.get(0));
        assertThat(manager.showItems().get(0).getName(),is("clue"));

    }

    @Test
    public void whatCanIBuy() {
        test.add(clue);
        test.get(0).setName("clue");
        test.get(0).setPrice(10.0);
        HypermarketManager manager = new HypermarketManager();
        manager.addGood(test.get(0));
        Human sviatik = new Human();
        sviatik.setMoney(10.0);
       assertThat(manager.whatCanIBuy(100).get(0).getName(),is("clue"));

    }

    @Test
    public void find() {
        test.add(clue);
        test.get(0).setName("clue");
        test.get(0).setPrice(10.0);
        HypermarketManager manager = new HypermarketManager();
        manager.addGood(test.get(0));
        assertEquals(manager.find("clue").get(0).getName(),manager.getGoods().get(0).getName());

    }



    @Test
    public void getName() {

        Good arsen = new Good();
        arsen.setName("Arsen");
        assertThat(arsen.getName(),is("Arsen"));
    }

    @Test
    public void setName() {
        Good arsen = new Good();
        arsen.setName("Arsen");
        assertThat(arsen.getName(),is("Arsen"));
    }

    @Test
    public void getManufacturer() {
        Good arsen = new Good();
        arsen.setManufacturer("Ua");
        assertThat(arsen.getManufacturer(),is("Ua"));
    }


    @Test
    public void setManufacturer() {

        Good arsen = new Good();
        arsen.setManufacturer("Ua");
        assertThat(arsen.getManufacturer(),is("Ua"));
    }

    @Test
    public void getPrice() {
        Good arsen = new Good();
        arsen.setPrice(100.0);
        assertThat(arsen.getPrice(),is(100.0));
    }

    @Test
    public void setPrice() {
        Good arsen = new Good();
        arsen.setPrice(100.0);
        assertThat(arsen.getPrice(),is(100.0));
    }

    @Test
    public void getAmount() {
        Good arsen = new Good();
        arsen.setAmount(100);
        assertThat(arsen.getAmount(),is(100));
    }

    @Test
    public void setAmount() {
        Good arsen = new Good();
        arsen.setAmount(100);
        assertThat(arsen.getAmount(),is(100));
    }

    @Test
    public void getMaterial() {
        Good arsen = new Good();
        arsen.setMaterial("tree");
        assertThat(arsen.getMaterial(),is("tree"));
    }

    @Test
    public void setMaterial() {
    Good arsen = new Good();
    arsen.setMaterial("tree");
    assertThat(arsen.getMaterial(),is("tree"));
    }

    @Test
    public void getGoods() {

    }

    @Test
    public void addGood() {
    }
}