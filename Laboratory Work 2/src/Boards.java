
public class Boards extends WoodenProducts {
	public Boards(String name, String material, double price, double width, double length, double thicknes,
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
		return "����� ������:" + this.getName() + " �������:" + this.getMaterial() + " ��������:"
				+ this.getManufacturer() + " ֳ��:" + this.getPrice() + " �������:" + this.getThicknes() + " ������:"
				+ this.getWidth() + " �������" + this.getLength() + " ʳ������:" + this.getAmount();

	}
}
