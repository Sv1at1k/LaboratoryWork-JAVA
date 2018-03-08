package nelab5;

public class Boards extends WoodenProducts {
	public Boards( String name, String material, double price, double width, double length, double thicknes,
			int amount) {
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
