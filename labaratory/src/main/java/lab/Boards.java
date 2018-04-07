public class Boards extends Good {
  private   int id;

    public Boards() {
    super();
    }
    public Boards(String type,String name,String manufacturer,int amount,double price) {
        super( type, name, manufacturer, amount, price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;    }
}
