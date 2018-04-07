package labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrickTest {
    @Test
    void constructorTest() {
        Brick brick = new Brick();
        Brick brick1 = new Brick("tyt", "ads", "name", "material", 10, 10.0);
    }
}