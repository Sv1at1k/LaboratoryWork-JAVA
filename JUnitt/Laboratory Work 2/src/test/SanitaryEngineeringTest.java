package test;

import Lab_4.Bowl;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SanitaryEngineeringTest {

    @Test
    public void getLength() {
    Bowl bowl = new Bowl();
        bowl.setLength(22.3);
        assertThat(bowl.getLength(),is(22.3));
    }

    @Test
    public void setLength() {
        Bowl bowl = new Bowl();
        bowl.setLength(22.3);
        assertThat(bowl.getLength(),is(22.3));
    }

    @Test
    public void getWidth() {
        Bowl bowl = new Bowl();
        bowl.setLength(33.3);
        assertThat(bowl.getLength(),is(33.3));
    }

    @Test
    public void setWidth() {
        Bowl bowl = new Bowl();
        bowl.setWidth(22.3);
        assertThat(bowl.getWidth(),is(22.3));
    }
}