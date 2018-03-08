package test;

import Lab_4.Boards;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WoodenProductsTest {

    @Test
    public void getMaterial() {
   Boards board = new Boards();
   board.setMaterial("wood");
   assertThat(board.getMaterial(),is("wood"));
    }

    @Test
    public void setMaterial() {
        Boards board = new Boards();
        board.setMaterial("wood");
        assertThat(board.getMaterial(),is("wood"));
    }

    @Test
    public void getThicknes() {
        Boards board = new Boards();
        board.setMaterial("wood");
        assertThat(board.getMaterial(),is("wood"));
    }

    @Test
    public void setThicknes() {
        Boards board = new Boards();
        board.setMaterial("wood");
        assertThat(board.getMaterial(),is("wood"));
    }

    @Test
    public void getWidth() {

        Boards board = new Boards();
        board.setWidth(32);
        assertThat(board.getWidth(),is(32.0));
    }

    @Test
    public void setWidth() {
        Boards board = new Boards();
        board.setWidth(32);
        assertThat(board.getWidth(),is(32.0));
    }

    @Test
    public void getLength() {
        Boards board = new Boards();
        board.setLength(20);
        assertThat(board.getLength(),is(20.0));
    }

    @Test
    public void setLength() {
        Boards board = new Boards();
        board.setLength(20);
        assertThat(board.getLength(),is(20.0));
    }
}