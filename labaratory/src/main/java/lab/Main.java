package lab;
public class Main {
public static void Main(){
    HypermarketManager hm = new HypermarketManager();
    hm.addGood(new Boards("Boards","Board","Manufacturer",1,2));
    hm.addGood(new Brick("Brick","brick","Manufacturer",12,24));
    hm.addGood(new Brick("Brick","brick1","Manufacturer",12,10));
    System.out.print(hm.find("Brick",5.0));
}

}
