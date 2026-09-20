import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String first = "listen";
		String second = "silent";

		char[] firstChars = first.toLowerCase().replace(" ", "").toCharArray();
		char[] secondChars = second.toLowerCase().replace(" ", "").toCharArray();
		Arrays.sort(firstChars);
		Arrays.sort(secondChars);

		System.out.println(Arrays.equals(firstChars, secondChars));
	}
}
