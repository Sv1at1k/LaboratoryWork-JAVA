package test;
import Lab_4.Bowl;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BowlTest {
    @Test
    public void Bowl() {
        Bowl bowl = new Bowl("name","asd",2,2);
        assertThat(bowl.getName(),is("name"));
        assertThat(bowl.getAmount(),is(2));
    }
}