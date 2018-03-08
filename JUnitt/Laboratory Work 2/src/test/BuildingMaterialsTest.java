package test;

import Lab_4.Boards;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BuildingMaterialsTest {

    @Test
    public void getMaterial() {
        Boards board = new Boards("board", "TREE", 10, 10, 30, 2, 50);
        board.setMaterial("andriy");
        assertThat(board.getMaterial(), is("andriy"));
    }

    @Test
    public void setMaterial() {
        Boards board = new Boards("board", "TREE", 10, 10, 30, 2, 50);
        board.setMaterial("andriy");
        assertThat(board.getMaterial(), is("andriy"));
    }
}