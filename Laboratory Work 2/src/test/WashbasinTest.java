package test;

import Lab_4.Washbasin;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WashbasinTest {
    @Test
    public void WashbasintTestConstructor(){
        Washbasin wash = new Washbasin("washbasin", "Poland", 50, 100, 1500, 32);
            assertThat(wash.getManufacturer(),is("Poland"));
        }

}