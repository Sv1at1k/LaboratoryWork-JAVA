
public class Main {

	public static void main(String[] args) {
		Flower Chamomile = new Flower();
		Flower Tulips= new Flower("tulips",20,10,15);
		Flower Roses = new Flower("roses",10,3,"Red",0);
		Chamomile.setName("chamomiles");
		Chamomile.setAmount(100);
		Chamomile.setPrice(2);
		System.out.println(Chamomile.toString());
		System.out.println(Tulips.toString());
		System.out.println(Roses.toString());
		Flower.printStaticSum();
		Chamomile.printSum();
		Tulips.printSum();
		Roses.printSum();
		Tulips.resetValue("tulips", 40, 15,"black" ,0);
		Roses.resetValue("roses", 1, 100500,"white",0);
		Chamomile.resetValue("chamomile", 9, 0.5, "white", 90);
		System.out.println(Chamomile.toString());
		System.out.println(Tulips.toString());
		System.out.println(Roses.toString());
		Flower.printStaticSum();
		Chamomile.printSum();
		Tulips.printSum();
		Roses.printSum();
	}

}
