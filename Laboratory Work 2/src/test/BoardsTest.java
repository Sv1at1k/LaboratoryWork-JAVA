package test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import Lab_4.Boards;

public class BoardsTest {
    @Test
    public void Boards() {
        Boards board = new Boards("board", "tree", 10, 3, 6, 40, 4);
        assertThat(board.getAmount(), is(4));

    }

    @Test
    public void testToString() {
        Boards board = new Boards("board", "tree", 10, 3, 6, 40, 4);


        assertThat(board.toString(), is("Назва товару:board Матеріал:tree Виробник:unknown Ціна:10.0 Товщина:40.0 Ширина:3.0 Довжина6.0 Кількість:4"));
        board.toString();
    }

}