package test;

import main.Waterpass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WaterpassTest {
    @Test
    public void WaterpassTestConstructor() {
        Waterpass water = new Waterpass();
        water.setName("water");
        assertThat(water.getName(),is("water"));

    }



}


