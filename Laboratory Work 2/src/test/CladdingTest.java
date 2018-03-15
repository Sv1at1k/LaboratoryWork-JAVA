package test;

import Lab_4.Cladding;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CladdingTest {
    @Test
    public void Cladding() {
        Cladding clad = new Cladding("clading", "MERRY", "Germany", 50, 10);
        assertThat(clad.getPrice(), is(50.0));
    }

}