import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
	public String readInputText() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = scan.nextLine();
		return s;

	}

	public String processText(String inputText) {
		
		/** Using ENUM**/
	/*	String[] subStr;
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
		} */
		
		/* Using  regular expresions  */
		Pattern p = Pattern.compile("\\b(a|the|or|are|on|in|out)\\b",Pattern.CASE_INSENSITIVE);   
		Matcher matcher = p.matcher(inputText);
		String finalStr = matcher.replaceAll("");
		
		
		return finalStr;
	}

	public void showResult(String resultText) {
		System.out.print(resultText);
	}

}
