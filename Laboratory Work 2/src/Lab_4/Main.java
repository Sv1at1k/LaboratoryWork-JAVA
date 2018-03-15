package Lab_4;


import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.*;


public class Main {
    public static void main(String[] argv) {
        Hypermarket arsen = new Hypermarket();
        arsen.setName("Arsen");
        Hypermarket[] goods = new Hypermarket[3];
        String path = "src\\Lab_4\\mydata.csv";
        goods[0] = new Nail("Gostro", 10, 2.3, 100);
        goods[0].setManufacturer("Poland");
        goods[1] = new Brick("brick", "Ukraine", "clue", 10.2, 203);
        goods[2] = new Washbasin("basin", "Ukraine", 101.0, 234.3, 1266, 2);
        // CVS.write(path,goods);
        String good[] = CVS.read(path);
        for (String x : good) {
            System.out.println(x + ";");
        }

    }
}
