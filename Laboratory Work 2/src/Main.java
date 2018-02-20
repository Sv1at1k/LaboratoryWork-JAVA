
public class Main {

	public static void main(String[] args) {
		Human sviatik = new Human("Sviatoslav", "Yatsynyk", 100);
		Hypermarket arsen = new Hypermarket();
		Hypermarket[] products = new Hypermarket[17];
		products[0] = new Clue("Клей пва", "Сирія", 1, 250);
		products[1] = new Brick("Цегла", "Голландія", "Глина", 4, 1000);
		products[2] = new Glass("Скло", "Україна", 500);

		products[3] = new Hammer("Молоток", "Фінляндія", 9.99, 100);
		products[4] = new Nail("Цвяхи", 40, 1, 500);
		products[5] = new Waterpass("Восервага", "Фінляндія", 100, 150, 50);

		products[6] = new Boards("Дошка", "дерево", 10, 10, 30, 2, 50);
		products[7] = new Cladding("Покриття", "черешня", "Німеччина", 50, 10);
		products[8] = new Parquet("Паркет", "дуб", "Рим", 70, 5, 10, 1, 100);

		products[9] = new Dye("Фарба", "червона", "Червона", 25, 15);
		products[10] = new Brush("Кисть", "Японія", 12, 40);
		products[11] = new Varnish("Лак", "прозорий", "Стрий", 17, 36);

		products[12] = new Bowl("Унітаз", "Польща", 2500, 10);
		products[13] = new Washbasin("Умивальник", "Польща", 50, 100, 1500, 32);
		products[14] = new Boiler("Бойлер", "Стрий", 50, 100, 4000, 11);
		products[15] = new Bowl("Високотехнологічний унітаз", "Китай", 5000, 5);
		products[16] = new Bowl("Супер високотехнологічний унітаз", "Японія", 25000, 2);
		// arsen.showItems(products);
		// arsen.find(products,"Стрий");
		  arsen.find(products, "Bowl", 3000);
		// arsen.whatCanIBuy(products, sviatik);

	}

}
