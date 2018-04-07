package test;

import main.Human;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void getName() {
   Human sviatik = new Human();
   sviatik.setName("Leonid");
   assertThat(sviatik.getName(),is("Leonid"));
    }


    @Test
    public void setName() {
        Human sviatik = new Human();
        sviatik.setName("Leonid");
        assertThat(sviatik.getName(),is("Leonid"));
    }

    @Test
    public void getSurName() {
        Human sviatik = new Human();
        sviatik.setSurName("Spartanec");
        assertThat(sviatik.getSurName(),is("Spartanec"));
    }

    @Test
    public void setSurName() {
        Human sviatik = new Human();
        sviatik.setSurName("Spartanec");
        assertThat(sviatik.getSurName(),is("Spartanec"));
    }

    @Test
    public void getMoney() {
        Human sviatik = new Human();
        sviatik.setMoney(999);
        assertThat(sviatik.getMoney(),is(999.0));
    }

    @Test
    public void setMoney() {
        Human sviatik = new Human();
        sviatik.setMoney(999);
        assertThat(sviatik.getMoney(),is(999.0));
    }
}