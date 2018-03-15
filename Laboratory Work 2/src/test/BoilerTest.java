package test;
import Lab_4.Boiler;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class BoilerTest {
    @Test
    public void BoilerConstructorTest() {
       Boiler boil = new Boiler("name","manufacturer",20,34,53,12);
        assertThat(boil.getPrice(),is(53.0));
        assertThat(boil.getAmount(),is(12));
    }
}