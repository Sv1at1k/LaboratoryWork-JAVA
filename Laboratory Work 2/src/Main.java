
public class Main {

	public static void main(String[] args) {
		Human sviatik = new Human("Sviatoslav", "Yatsynyk", 100);
		Hypermarket arsen = new Hypermarket();
		Hypermarket[] products = new Hypermarket[17];
		products[0] = new Clue("Клей ПВА", "Китай", 1, 250);
		products[1] = new Brick("Цегла", "Україна", "Глина", 4, 1000);
		products[2] = new Glass("Скло прозоре", "Фінляндія", 500);

		products[3] = new Hammer("Молоток", "Стрий", 9.99, 100);
		products[4] = new Nail("Цвяхи", 40, 1, 500);
		products[5] = new Waterpass("Восервага", "Монголія", 100, 150, 50);

		products[6] = new Boards("Дошка", "дерево", 10, 10, 30, 2, 50);
		products[7] = new Cladding("Облицювання", "черешня", "Німеччина", 50, 10);
		products[8] = new Parquet("Паркет", "дуб", "Франція", 70, 5, 10, 1, 100);

		products[9] = new Dye("Веселка", "Голандія", "червона", 25, 15);
		products[10] = new Brush("Кисть", "Іспанія", 12, 40);
		products[11] = new Varnish("Лак", "Ріо", "світлий", 17, 36);

		products[12] = new Bowl("Унітаз", "Польща", 2500, 10);
		products[13] = new Washbasin("Умивальник", "Польща", 50, 100, 1500, 32);
		products[14] = new Boiler("Бойлер", "Польща", 50, 100, 4000, 11);
		products[15] = new Bowl("Технологічний унітаз", "Китай", 5000, 5);
		products[16] = new Bowl("Cупер технологічний унітаз", "Японія", 25000, 2);
		// arsen.showItems(products);
		// arsen.find(products,"Лак");
		  arsen.find(products, "Boards", 11);
		// arsen.whatCanIBuy(products, sviatik);

	}

}
