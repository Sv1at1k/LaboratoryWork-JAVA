package Lab_4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.Scanner;

class CVS {


    public static void write(final String path, final Hypermarket[] goods) {
        try {
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (Hypermarket h : goods) {
                pw.println(h.toString() + ";");
            }
            pw.close();
            System.out.print("Done");

        } catch (Exception e) {
            System.out.print("Failed");
        }


    }

    public static String[] read(final String path) {
        File file = new File(path);
        String goods = new String();
        try {
            System.out.print("Reading Done \n");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                goods += scan.next() + " ";

            }
        } catch (Exception e) {
            System.out.println("Reading failed");

        }
        String[] strArr = goods.split(";");
        return strArr;
    }
}
