import java.util.LinkedList;
import java.util.List;

public class Good {
    public Good() {
    }

    public Good(String type, String name, String manufacturer, int amount, double price) {
        setType(type);
        setName(name);
        setManufacturer(manufacturer);
        setAmount(amount);
        setPrice(price);
    }
    private String manufacturer;
    private String name;
    private double price;
    private int amount;
    private String type;
    private String material;

    @Override
    public String toString() {
        return getType() + ";\n" + getName() + ";\n" + getManufacturer() + ";\n" + getAmount() + ";\n" + getPrice();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
