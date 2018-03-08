package test;

import Lab_4.Hammer;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HammerTest {
   @Test
    public void HammerTestConstructor() {
       Hammer hamer = new Hammer("hamer", "Stryy", 9.99, 100);

   assertThat(hamer.getPrice(),is(9.99));
   }

}