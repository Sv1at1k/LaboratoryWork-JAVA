package test;

import Lab_4.Boards;
import Lab_4.Hypermarket;
import Lab_4.*;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HypermarketTest extends Output {


    @Test
    public void testToString() {
        Hypermarket hypo = new Hypermarket();
        hypo.setName("arsen");
       String s =  hypo.toString();
        assertThat(s,is("Product name:arsen Material:null Manufacturer:unknown Price:0.0 Amount:0"));


    }
    @Test
    public void showItems() {
   Hypermarket [] goods = new Hypermarket[1];
   Hypermarket arsen = new Hypermarket();
   goods[0] = new Boards();
   goods[0].setName("board");
    Hypermarket x = arsen.showItems(goods);
        assertThat(x,is(goods[0]));

    }

    @Test
    public void whatCanIBuy() {
        Hypermarket [] goods = new Hypermarket[1];
        Hypermarket arsen = new Hypermarket();
        goods[0] = new Boards();
        goods[0].setName("board");
        Human sviatk = new Human();
        sviatk.setMoney(10);
       assertThat(arsen.whatCanIBuy(goods,sviatk),is(goods[0]));

    }

    @Test
    public void find() {
        Hypermarket [] goods = new Hypermarket[2];
        Hypermarket arsen = new Hypermarket();
        goods[0] = new Boards();
        goods[0].setName("Boards");
        goods[1] = new Boards();
        goods[1].setAmount(10);
        Hypermarket x = arsen.find(goods,10);
        assertEquals(x,goods[1]);

    }



    @Test
    public void getName() {

        Hypermarket arsen = new Hypermarket();
        arsen.setName("Arsen");
        assertThat(arsen.getName(),is("Arsen"));
    }

    @Test
    public void setName() {
        Hypermarket arsen = new Hypermarket();
        arsen.setName("Arsen");
        assertThat(arsen.getName(),is("Arsen"));
    }

    @Test
    public void getManufacturer() {
        Hypermarket arsen = new Hypermarket();
        arsen.setManufacturer("Ua");
        assertThat(arsen.getManufacturer(),is("Ua"));
    }


    @Test
    public void setManufacturer() {

        Hypermarket arsen = new Hypermarket();
        arsen.setManufacturer("Ua");
        assertThat(arsen.getManufacturer(),is("Ua"));
    }

    @Test
    public void getPrice() {
        Hypermarket arsen = new Hypermarket();
        arsen.setPrice(100.0);
        assertThat(arsen.getPrice(),is(100.0));
    }

    @Test
    public void setPrice() {
        Hypermarket arsen = new Hypermarket();
        arsen.setPrice(100.0);
        assertThat(arsen.getPrice(),is(100.0));
    }

    @Test
    public void getAmount() {
        Hypermarket arsen = new Hypermarket();
        arsen.setAmount(100);
        assertThat(arsen.getAmount(),is(100));
    }

    @Test
    public void setAmount() {
        Hypermarket arsen = new Hypermarket();
        arsen.setAmount(100);
        assertThat(arsen.getAmount(),is(100));
    }

    @Test
    public void getType() {
        Hypermarket arsen = new Hypermarket();
        arsen.setType("type");
        assertThat(arsen.getType(),is("type"));
    }

    @Test
    public void setType() {
        Hypermarket arsen = new Hypermarket();
        arsen.setType("type");
        assertThat(arsen.getType(),is("type"));
    }

    @Test
    public void getMaterial() {
        Hypermarket arsen = new Hypermarket();
        arsen.setMaterial("tree");
        assertThat(arsen.getMaterial(),is("tree"));
    }

    @Test
    public void setMaterial() {
    Hypermarket arsen = new Hypermarket();
    arsen.setMaterial("tree");
    assertThat(arsen.getMaterial(),is("tree"));
    }
}