public class togglecase {
	public static void main(String[] args) {
		String text = "JaVa 123";
		String result = "";

		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character >= 'A' && character <= 'Z') {
				result += (char) (character + ('a' - 'A'));
			} else if (character >= 'a' && character <= 'z') {
				result += (char) (character - ('a' - 'A'));
			} else {
				result += character;
			}
		}

		System.out.println(result);
	}
}
