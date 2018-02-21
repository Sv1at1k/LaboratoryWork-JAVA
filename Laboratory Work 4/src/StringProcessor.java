import java.util.Scanner;

public class StringProcessor {
	public String readInputText() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = scan.nextLine();
		return s;

	}

	public String processText(String inputText) {
		String[] subStr;
		String finalStr = "";
		subStr = inputText.split(" ");
		for (int i = 0; i < subStr.length; i++) {
			boolean check = false;
			for (Words w : Words.values()) {
				if (subStr[i].toLowerCase().equals(w.toString().toLowerCase())) {
					check = true;
				}

			}
			if (!check) {

				finalStr = finalStr + subStr[i] + " ";
			}
		}
		return finalStr;
	}

	public void showResult(String resultText) {
		System.out.print(resultText);
	}

}
