
public class Flower {
private String name;
private int amount;
private double price;
private String color = "classic";
private  int discount;
public static int totalAmount = 0  ;
	public Flower() {
		}
	public Flower (String name,int amount,double price,int discount) {
		setName(name);
		setAmount(amount);
		setPrice(price);
		setDiscount(discount);
		 
		}
	public Flower (String name,int amount,double price,String color,int discount) {
		setName(name);
		setAmount(amount);
		setPrice(price);
		setColor(color);
		setDiscount(discount);
		
		}
	
	public String toString() {
	return   "� ������� � " + getAmount() + " " + getName() + " " + getColor() + " " + "�������" + ".ֳ�� 1 ����� �� ������� " + getDiscount() + "% ������� " + getPrice()  + " ���" ;
		}
	static void printStaticSum() {
		System.out.println("�������� ������� ���� � �������: " + totalAmount);
	}
	
	public void printSum() {
		System.out.println("����� �� "+ getAmount()  +" " + getName()+ " �������� ������� ���� � �������: " + totalAmount);
		}
	public void resetValue(String name,int amount,double price,String color,int discount) {
		setName(name);
		setAmount(amount);
		setPrice(price);
		setColor(color);
		setDiscount(discount);
		}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		totalAmount =totalAmount - this.amount + amount; 
		this.amount = amount;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
