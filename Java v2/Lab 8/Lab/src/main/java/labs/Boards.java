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

    @Override
    public String toString() {
        return  "ID:"+"Product name:" + this.getName() + " Material:" + this.getMaterial() + " Manufacturer:" + this.getManufacturer() + " Price:"
                + this.getPrice() + " Amount:" + this.getAmount();
    }

    @Override
    public String toCSV() {
        return  super.toCSV() + "," + id;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "id";
    }
}

