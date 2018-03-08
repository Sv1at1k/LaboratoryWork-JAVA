package nelab5;

public class Hypermarket {
 private	static int productsAmount = 0;
	private String manufacturer = "unknown";
	private String name = "no name";
	private double price;
	private int amount = 0;
	private String type;
	private String material;

	public String toString() {
		return "Product name:" + this.getName() + " Material:" + this.getMaterial() + " Manufacturer:" + this.getManufacturer() + " Price:"
				+ this.getPrice() + " Amount:" + this.getAmount();

	}

	public void showItems(final Hypermarket[] products) {
		System.out.println("Goods list:");
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			System.out
					.println("Product name:" + products[i].getName() + " Manufacturer:" + products[i].getManufacturer()
							+ " Price:" + products[i].getPrice() + " Amount:" + products[i].getAmount());

		}

	}

	public void whatCanIBuy(final Hypermarket[] products, final Human human) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			if (products[i].getPrice() < human.getMoney()) {
				System.out.println(products[i].toString());
				x++;

			}

		}
		if (x == 0) {
			System.out.println("You do not have enough money to buy something.");
		}
	}

	public void find(final Hypermarket[] products, final String key) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			if (products[i].getClass().getName().toString() == key 
					|| (products[i].getName() == key)
					|| (products[i].getManufacturer() == key)
					|| (Materials.valueOf(key).toString() == products[i].getMaterial())) {
				x++;
				System.out.println(products[i].toString());
			}

		}
		if (x == 0) {
			System.out.println("I didnt found nothing");
		}
	}

	public void find(final Hypermarket[] products, final int key) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			if (products[i].getAmount() == key) {
				x++;
				System.out.println(products[i].toString());
			}

		}
		if (x == 0) {
			System.out.println("I didnt found nothing");
		}
	}

	public void find(final Hypermarket[] products, final double key) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
			if (products[i].price == key) {
				x++;
				System.out.println(products[i].toString());
			}

		}
		if (x == 0) {
			System.out.println("I didnt found nothing");
		}
	}

	public void find(final Hypermarket[] products, final String key, final int price) {
		int x = 0;
		for (int i = 0; i < Hypermarket.productsAmount; i++) {
     		if (products[i].getClass().getName().toString() == key
					&& (products[i].getPrice() > price)) {
				x++;
				System.out.println(products[i].toString());
			}

		}
		if (x == 0) {
			System.out.println("I didnt found nothing");
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

	public void setManufacturer(final String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount( final int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		productsAmount += 1;
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(final String material) {
		this.material = material;
	}

}
