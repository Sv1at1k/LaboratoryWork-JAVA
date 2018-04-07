package test;

import main.Hammer;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HammerTest {
   @Test
    public void HammerTestConstructor() {
       Hammer hamer = new Hammer();
       hamer.setPrice(9.99);
   assertThat(hamer.getPrice(),is(9.99));
   }

}