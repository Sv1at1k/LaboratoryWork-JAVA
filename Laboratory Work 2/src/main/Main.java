package main;


public class Main {
    public static void main(String[] argv) {
       final String path = "src\\main.Lab_4\\mydata.csv";
        Boards boards = new Boards("Lviv","Boards",1.0,123,"Boards","Tree");
       Boards boards1 = new Boards();
       boards1.setName("board11111");
       boards1.setPrice(213);
        Brick brick = new Brick();
        brick.setAmount(1000);
        boards1.setManufacturer("Lviv");
        HypermarketManager hypermarketManager = new HypermarketManager();

        hypermarketManager.addGood(boards);
        hypermarketManager.addGood(brick);
        hypermarketManager.addGood(boards1);
        System.out.print(hypermarketManager.find("Boards"));



      //   CvsWritter.write(path,hypermarketManager.getGoods());
        // CvsWritter.read(path);

    }
}
