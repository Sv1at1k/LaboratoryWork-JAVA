package test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import main.Boards;

public class BoardsTest {
    @Test
    public void Boards() {
        Boards board = new Boards();
        board.setAmount(4);
        assertThat(board.getAmount(), is(4));

    }


}