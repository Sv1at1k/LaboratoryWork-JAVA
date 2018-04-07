package test;

import main.Glass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GlassTest {
@Test
    public void GlassTestConstructor (){

  Glass glas =   new Glass();
  glas.setPrice(500.0);
 assertThat(glas.getPrice(),is(500.0));
}
}