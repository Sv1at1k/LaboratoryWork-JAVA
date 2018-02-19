
public class Main {

	public static void main(String[] args) {
		Flower ñhamomile = new Flower();
		Flower tulips= new Flower("tulips",20,10,15);
		Flower roses = new Flower("roses",10,3,"Red",0);
		chamomile.setName("chamomiles");
		chamomile.setAmount(100);
		chamomile.setPrice(2);
		System.out.println(chamomile.toString());
		System.out.println(tulips.toString());
		System.out.println(roses.toString());
		Flower.printStaticSum();
		chamomile.printSum();
		tulips.printSum();
		toses.printSum();
		tulips.resetValue("tulips", 40, 15,"black" ,0);
		roses.resetValue("roses", 1, 100500,"white",0);
		chamomile.resetValue("chamomile", 9, 0.5, "white", 90);
		System.out.println(chamomile.toString());
		System.out.println(tulips.toString());
		System.out.println(roses.toString());
		Flower.printStaticSum();
		chamomile.printSum();
		tulips.printSum();
		roses.printSum();
	}

}
