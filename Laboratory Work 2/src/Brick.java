
public class Brick extends BuildingMaterials {
	public Brick(String name, String manufacturer, String material, double price, int amount) {
		setName(name);
		setMaterial(material);
		setManufacturer(manufacturer);
		setPrice(price);
		setAmount(amount);
	}

	public String toString() {
		return "Назва товару:" + this.getName() + " Матеріал:" + this.getMaterial() + " Виробник:"
				+ this.getManufacturer() + " Ціна:" + this.getPrice() + " Кількість:" + this.getAmount();

	}

}
