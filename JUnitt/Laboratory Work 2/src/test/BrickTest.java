package test;

import org.junit.Assert;
import org.junit.Test;
import Lab_4.Brick;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BrickTest {

    @Test
    public void Brick() {
        Brick brick = new Brick("brick","Poland","clue",3,4);
        Assert.assertEquals(brick.getAmount(),4);
        assertThat(brick.getPrice(),is(3.0));
    }
    @Test
    public void TestToString() {
        Brick brick = new Brick("brick","Poland","clue",3,4);
        Assert.assertEquals(brick.getName(),"brick");
        assertThat(brick.getPrice(),is(3.0));

    }
}