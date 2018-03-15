package test;

import Lab_4.Waterpass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WaterpassTest {
    @Test
    public void WaterpassTestConstructor() {
        Waterpass water = new Waterpass("voservaga", "Mongolia", 100, 150, 50);
        assertThat(water.getAmount(),is(50));

    }



}


