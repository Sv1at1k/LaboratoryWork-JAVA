
public class Brick extends BuildingMaterials {
	public Brick(String name, String manufacturer, String material, double price, int amount) {
		setName(name);
		setMaterial(material);
		setManufacturer(manufacturer);
		setPrice(price);
		setAmount(amount);
	}

	public String toString() {
		return "����� ������:" + this.getName() + " �������:" + this.getMaterial() + " ��������:"
				+ this.getManufacturer() + " ֳ��:" + this.getPrice() + " ʳ������:" + this.getAmount();

	}

}
