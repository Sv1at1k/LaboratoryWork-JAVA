package test;

import Lab_4.Glass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GlassTest {
@Test
    public void GlassTestConstructor (){

  Glass glas =   new Glass("transparent glass", "Finland", 500);
 assertThat(glas.getPrice(),is(500.0));
}
}