package test;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import Lab_4.Brush;
public class BrushTest {

    @Test
    public void Brush(){
    Brush brush = new Brush ("brush", "Spain", 12, 40);
    assertThat(brush.getPrice(),is(12.0));


    }
}