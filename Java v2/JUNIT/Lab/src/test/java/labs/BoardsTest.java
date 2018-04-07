package labs;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BoardsTest {

    @org.junit.jupiter.api.Test
    void getId() {
     Boards board = new Boards();
       Boards testBoard = new Boards("tyt","ads","name","material",10,10.0);
       testBoard.setId(10);
      assertEquals(10,testBoard.getId());
    }


}