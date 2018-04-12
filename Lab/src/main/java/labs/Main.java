package labs;

public class Main {
    private static String path = "E:\\Programing\\Лаби\\JAVA\\LaboratoryWork-JAVA\\Lab\\src\\main\\java\\labs\\mydata.csv";
    public static void main(String [] args)
{
    HypermarketManager hm = new HypermarketManager();
    hm.addGood(new Boards("Дошка","Виробник","Дерево", "213",2,3));

    hm.addGood(new Glass("Скло","Виробник","Пісок", "213",2,3));
    CvsWritter.write(path,hm.getGoods());
    CvsWritter.read(path);
        }
}
