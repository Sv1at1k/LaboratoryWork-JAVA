package labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodTest {

    @Test
    void tostring() {
    Good good = new Good();
    assertEquals("Product name:null Material:null Manufacturer:null Price:0.0 Amount:0",good.toString());

    }
    @Test
    void toCSV() {
        Good good = new Good();

        assertEquals("Product name:null,Material:null,Manufacturer:null,Price:0.0,Amount:0",good.toCSV());
    }


    @Test
    void getName() {
  Good good = new Good("tyt","ads","name","material",10,10.0);
  good.setName("name");
  assertEquals("name",good.getName());

    }

    @Test
    void getManufacturer() {
        Good good = new Good();
        good.setManufacturer("man");
        assertEquals("man",good.getManufacturer());
    }

    @Test
    void getPrice() {
        Good good = new Good();
        good. setPrice(20.0);
        assertEquals(20.0,good.getPrice());
    }


    @Test
    void getAmount() {
        Good good = new Good();
        good.setAmount(30);
        assertEquals(30,good.getAmount());
    }

    @Test
    void getType() {
        Good good = new Good();
        good.setType("man");
        assertEquals("man",good.getType());
    }

    @Test
    void getMaterial() {
        Good good = new Good();
        good.setMaterial("man");
        assertEquals("man",good.
        getMaterial());
    }
}