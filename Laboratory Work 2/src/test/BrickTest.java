package test;

import org.junit.Test;
import main.Brick;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BrickTest {

    @Test
    public void Brick() {
        Brick brick = new Brick();
        brick.setName("brick");
        assertThat(brick.getName(), is("brick"));
    }

}