package test;

import Lab_4.Nail;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NailTest {
@Test
    public void TestNailConstructor(){

    Nail nail = new Nail("nail", 40, 1, 500);
    assertThat(nail.getName(),is("nail"));
}
}