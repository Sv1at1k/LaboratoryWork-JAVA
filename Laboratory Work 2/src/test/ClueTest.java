package test;

import main.Clue;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ClueTest {
@Test
    public void ClueTestConstructor(){

    Clue clue  = new Clue();
    clue.setPrice(1.0);
    assertThat(clue.getPrice(),is(1.0));
}
}