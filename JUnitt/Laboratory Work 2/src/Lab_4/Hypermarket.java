package Lab_4;

public class Hypermarket {
	static int productsAmount = 0;
	private String manufacturer = "unknown";
	private String name = "no name";
	private double price;
	private int amount = 0;
	private String type;
	private String material;

	public String toString() {

	    return "  Product name:" + this.getName() +" Material:"+ this.getMaterial() +" Manufacturer:" + this.getManufacturer() + " Price:"
				+ this.getPrice() + " Amount:" + this.getAmount();

	}

	public Hypermarket showItems(Hypermarket[] products) {
Hypermarket goods []= new Hypermarket[products.length];
		for (int i = 0; i < products.length; i++) {
		   goods[i] = products[i];
		     System.out.println(products[i].toString());

		}

	return  goods[0];
	}

	public Hypermarket whatCanIBuy(Hypermarket[] products, Human human) {
		int x = 0;

		Hypermarket good = new Hypermarket();
		for (int i = 0; i < products.length; i++) {
			if (products[i].getPrice() < human.getMoney()) {
				good = products[i];
			    System.out.println(products[i].toString());
				x++;

			}

		}
		if (x == 0) {
			System.out.println("You do not have enough money to buy something");
	        good = null;
			}
		return good ;
	}

	public Hypermarket find (Hypermarket[] products, String key) {
		int x = 0;

		Hypermarket good =  new Hypermarket();
		for (int i = 0; i < products.length; i++) {
			if (products[i].getClass().getName().toString() == key 
					|| (products[i].getName() == key)
					|| (products[i].getManufacturer() == key)) {
				x++;
				 good = products[i];

				//System.out.println(products[i].toString());

			}

		}
		if (x == 0) {
			good = null;
		    System.out.println("I didnt found nothing");
		}
	return good;
	}

	public  Hypermarket find(Hypermarket[] products, int key) {
		int x = 0;
        Hypermarket good =  new Hypermarket();
		for (int i = 0; i <products.length; i++) {
			if (products[i].getAmount() == key) {
				x++;
				good = products[i];
				System.out.println(products[i].toString());
			}

		}
		if (x == 0) {
			good = null;

		}
        return good;
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
		productsAmount += 1;
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
