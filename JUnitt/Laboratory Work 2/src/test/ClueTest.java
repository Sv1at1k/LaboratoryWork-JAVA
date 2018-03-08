package test;

import Lab_4.Clue;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ClueTest {
@Test
    public void ClueTestConstructor(){

    Clue clue  = new Clue("clue PVA", "China", 1, 250);
    assertThat(clue.getPrice(),is(1.0));
}
}