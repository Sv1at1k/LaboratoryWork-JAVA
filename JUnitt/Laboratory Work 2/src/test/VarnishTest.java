package test;

import Lab_4.Varnish;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class VarnishTest {
@Test
    public void VarnishTestConstructor(){

    Varnish varn = new Varnish("varn", "Rio", "light", 17, 36);
    assertThat(varn.getManufacturer(),is("Rio"));

}
}