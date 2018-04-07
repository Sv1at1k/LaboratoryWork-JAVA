package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.List;
import java.util.Scanner;

class CvsWritter {

    public static void write(final String path, final List<Good> goods) {
        try (FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw)){

            pw.print(Good.getHeaders()+"\n");
            for (Good good : goods) {
                pw.println(good.toString()+ ";");
            }
            System.out.print("Writing done\n");

        } catch (Exception e) {
            System.out.print("Failed\n");
        }
    }

    public static void read(final String path) {
        File file = new File(path);
        String goods = new String();
        try {
            System.out.print("Reading done \n");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                goods += scan.next() + " ";
            }
        } catch (Exception e) {
            System.out.println("Reading failed");

        }
        String[] strArr = goods.split(";");

        for(String x:strArr){
            System.out.println(x);

        }


    }
}
