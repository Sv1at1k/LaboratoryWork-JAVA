package labs.IoT;


import javax.persistence.*;

@Entity
public class Good {
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Good")
    private Integer id;

    @Column(name = "Manufacturer")
    private String manufacturer;

    @Column(name = "Name")
    private String name;

    @Column(name = "Price")
    private double price;

    @Column(name = "AmouNt")
    private int amount;

    @Column(name = "Type")
    private String type;

    @Column(name = "Material")
    private String material;

    public Good() {
    }

    public Good(String type, String manufacturer, String name, String material, int amount, double price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.type = type;
        this.material = material;
    }

    public String toString() {
        return "Product name:" + this.getName() + " Material:" + this.getMaterial() + " Manufacturer:" + this.getManufacturer() + " Price:"
                + this.getPrice() + " Amount:" + this.getAmount();
    }

    public String toCSV() {
        return this.getName() + "," + this.getMaterial() + "," + this.getManufacturer() + ","
                + this.getPrice() + "," + this.getAmount();
    }

    public String getHeaders() {
        return "Name," + "Material," + "Manufacturer," + "Price," + "Amount,";

    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}