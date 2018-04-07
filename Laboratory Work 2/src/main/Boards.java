package main;

public class Boards extends Good {
  private   int id;

    public Boards() {
    super();
    }
    public Boards(String manufacturer,String name,double price,int amount,String type,String material) {
        super(manufacturer, name, price, amount, type,material);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;    }
}
