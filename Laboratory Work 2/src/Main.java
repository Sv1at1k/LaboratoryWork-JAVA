
public class Main {

	public static void main(String[] args) {
		Human sviatik = new Human("Sviatoslav", "Yatsynyk", 100);
		Hypermarket arsen = new Hypermarket();
		Hypermarket[] products = new Hypermarket[17];
		products[0] = new Clue("���� ���", "�����", 1, 250);
		products[1] = new Brick("�����", "������", "�����", 4, 1000);
		products[2] = new Glass("���� �������", "Գ������", 500);

		products[3] = new Hammer("�������", "�����", 9.99, 100);
		products[4] = new Nail("�����", 40, 1, 500);
		products[5] = new Waterpass("���������", "�������", 100, 150, 50);

		products[6] = new Boards("�����", "������", 10, 10, 30, 2, 50);
		products[7] = new Cladding("�����������", "�������", "ͳ�������", 50, 10);
		products[8] = new Parquet("������", "���", "�������", 70, 5, 10, 1, 100);

		products[9] = new Dye("�������", "�������", "�������", 25, 15);
		products[10] = new Brush("�����", "������", 12, 40);
		products[11] = new Varnish("���", "г�", "������", 17, 36);

		products[12] = new Bowl("�����", "������", 2500, 10);
		products[13] = new Washbasin("����������", "������", 50, 100, 1500, 32);
		products[14] = new Boiler("������", "������", 50, 100, 4000, 11);
		products[15] = new Bowl("������������ �����", "�����", 5000, 5);
		products[16] = new Bowl("C���� ������������ �����", "�����", 25000, 2);
		// arsen.showItems(products);
		// arsen.find(products,"���");
		  arsen.find(products, "Boards", 11);
		// arsen.whatCanIBuy(products, sviatik);

	}

}
