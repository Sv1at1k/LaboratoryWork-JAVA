import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		StringProcessor processor = new StringProcessor();
		String str = processor.readInputText();
		processor.showResult(processor.processText(str));

	}
}
