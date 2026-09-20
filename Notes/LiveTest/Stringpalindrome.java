public class Stringpalindrome {
	public static void main(String[] args) {
		String text = "Madam";
		int left = 0;
		int right = text.length() - 1;
		boolean palindrome = true;

		while (left < right) {
			if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) {
				palindrome = false;
				break;
			}
			left++;
			right--;
		}

		System.out.println(palindrome);
	}
}
