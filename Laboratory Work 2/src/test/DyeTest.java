package test;

import Lab_4.Dye;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DyeTest {

    @Test
    public void DyeTestConstructor(){

       Dye dye  = new Dye("rainbow", "Holland", "red", 25, 15);
        assertThat(dye.getName(),is("rainbow"));
    }
}