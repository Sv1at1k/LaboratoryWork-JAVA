package Lab_4;

public class Boards extends WoodenProducts {
    public Boards() {
    }



    public Boards(final String name, final String material, final double price, final double width, final double length, final double thicknes, final int amount) {
        setName(name);
        setMaterial(material);
        setThicknes(thicknes);
        setWidth(width);
        setLength(length);
        setPrice(price);
        setAmount(amount);

    }

    public String toString() {
        return "Назва товару:" + this.getName() + " Матеріал:" + this.getMaterial() + " Виробник:"
                + this.getManufacturer() + " Ціна:" + this.getPrice() + " Товщина:" + this.getThicknes() + " Ширина:"
                + this.getWidth() + " Довжина" + this.getLength() + " Кількість:" + this.getAmount();

    }
}
