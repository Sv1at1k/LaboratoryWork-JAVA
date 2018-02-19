
public class Hypermarket {
	static int productsAmount = 0;
	private String manufacturer = "невідомо";
	private String name = "Без назви";
	private double price;
	private int amount = 0;
	private int itemsAmount;
	private String type;

	public String toString() {
		return "Назва товару:" + this.getName() + " Виробник:" + this.getManufacturer() + " Ціна:" + this.getPrice()
				+ " Кількість:" + this.getAmount();

	}

	public void showItems(Hypermarket[] products) {
		System.out.println("Список товарів наявних у магазині:");
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			System.out.println("Назва товару:" + products[i].getName() + " Виробник:" + products[i].getManufacturer()
					+ " Ціна:" + products[i].getPrice() + " Кількість:" + products[i].getAmount());

		}

	}

	public void whatCanIBuy(Hypermarket[] products, Human human) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			if (products[i].getPrice() < human.getMoney()) {
				System.out.println(products[i].toString());
				x++;

			}

		}
		if (x == 0) {
			System.out.println("У вас недостатньо коштів для того щоб придбати щось у нашому магазині.");
		}
	}

	public void find(Hypermarket[] products, String key) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			if (products[i].getClass().getName().toString() == key || products[i].getName() == key
					|| products[i].getManufacturer() == key) {
				x++;
				System.out.println(products[i].toString());
			}

		}
		if (x == 0) {
			System.out.println("Нічого не знайдено");
		}
	}

	public void find(Hypermarket[] products, int key) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			if (products[i].getAmount() == key) {
				x++;
				System.out.println(products[i].toString());
			}

		}
		if (x == 0) {
			System.out.println("Нічого не знайдено");
		}
	}

	public void find(Hypermarket[] products, double key) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			if (products[i].price == key) {
				x++;
				System.out.println(products[i].toString());
			}

		}
		if (x == 0) {
			System.out.println("Нічого не знайдено");
		}
	}

	public void find(Hypermarket[] products, String key, int price) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			if (products[i].getClass().getName().toString() == key && products[i].getPrice() > price) {
				x++;
				System.out.println(products[i].toString());
			}

		}
		if (x == 0) {
			System.out.println("Нічого не знайдено");
		}
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

	public int getItemsAmount() {
		return itemsAmount;
	}

	public void setItemsAmount(int itemsAmount) {
		this.itemsAmount = itemsAmount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		productsAmount += 1;
		this.type = type;
	}

}
