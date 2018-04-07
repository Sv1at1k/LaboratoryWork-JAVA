package main;

public class Good {
    public Good(){}
    public Good(String manufacturer,String name,double price,int amount,String type,String material) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.type = type;
        this.material = material;
    }

    private String manufacturer ;
    private String name;
    private double price;
    private int amount;
    private String type;
    private String material;

    public String toString() {
        return "Product name:" + this.getName() + " Material:" + this.getMaterial() + " Manufacturer:" + this.getManufacturer() + " Price:"
                + this.getPrice() + " Amount:" + this.getAmount();
    }

    public String toCSV() {
        return "Product name:" + this.getName() + ",Material:" + this.getMaterial() + ",Manufacturer:" + this.getManufacturer() + ",Price:"
                + this.getPrice() + ",Amount:" + this.getAmount();
    }
    public static String getHeaders(){
        return "Name:\n" + "Material:\n" + "Manufacturer:\n" + "Price:\n" + "Amount:\n";


    }



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

}
