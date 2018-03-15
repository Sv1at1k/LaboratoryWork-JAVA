package Lab_4;

public class WoodenProducts extends Hypermarket {
    private String material;
    private double thicknes;
    private double width;
    private double length;

    public WoodenProducts() {
        setType("WoodenProducts");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getThicknes() {
        return thicknes;
    }

    public void setThicknes(double thicknes) {
        this.thicknes = thicknes;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
