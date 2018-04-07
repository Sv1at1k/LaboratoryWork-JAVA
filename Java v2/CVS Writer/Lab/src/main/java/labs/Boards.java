package labs;

public class Boards extends Good {
  private   int id;

    public Boards() {
    super();
    }
    public Boards(String type,String manufacturer,String name,String material,int amount,double price) {
        super(type,manufacturer, name, material, amount,price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;    }
}
