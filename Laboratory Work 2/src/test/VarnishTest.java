package test;

import main.Varnish;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class VarnishTest {
@Test
    public void VarnishTestConstructor(){

    Varnish varn = new Varnish();
    varn.setManufacturer("Rio");
    assertThat(varn.getManufacturer(),is("Rio"));

}
}