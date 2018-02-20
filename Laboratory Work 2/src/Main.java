
public class Main {

	public static void main(String[] args) {
		Human sviatik = new Human("Sviatoslav", "Yatsynyk", 100); // name , surname , money 
		Hypermarket arsen = new Hypermarket();
		Hypermarket[] products = new Hypermarket[17];
		products[0] = new Clue("clue PVA", "China", 1, 250); // name , country , price
		products[1] = new Brick("brick", "Ukraine", "сlay", 4, 1000); // name , country, material, price, amount
		products[2] = new Glass("transparent glass", "Finland", 500);

		products[3] = new Hammer("hamer", "Stryy", 9.99, 100);
		products[4] = new Nail("nail", 40, 1, 500);
		products[5] = new Waterpass("voservaga", "Mongolia", 100, 150, 50);

		products[6] = new Boards("board", "TREE", 10, 10, 30, 2, 50);// name , material , thickness,  length,height,amount ,price
		products[7] = new Cladding("clading", "MERRY", "Germany", 50, 10);
		products[8] = new Parquet("parquet", "OAK", "France", 70, 5, 10, 1, 100); // name , material, country, length,height,amount ,price

		products[9] = new Dye("rainbow", "Holland", "red", 25, 15);
		products[10] = new Brush("brush", "Spain", 12, 40);
		products[11] = new Varnish("varn", "Rio", "light", 17, 36);

		products[12] = new Bowl("lavatory pan", "Poland", 2500, 10);
		products[13] = new Washbasin("washbasin", "Poland", 50, 100, 1500, 32);
		products[14] = new Boiler("boiler", "Poland", 50, 100, 4000, 11);
		products[15] = new Bowl("Technological lavatory pan", "China", 5000, 5);
		products[16] = new Bowl(" Super technological lavatory pan", "Japan", 25000, 2);
		// arsen.showItems(products); // Показати усі товари
		 arsen.find(products,"OAK");  // search by parameter (any)
		 // arsen.find(products, "Bowl", 3000 );  // search by name and price
		// arsen.whatCanIBuy(products, sviatik); // goods that I can buy(depends on the amount of money)
	}

}
