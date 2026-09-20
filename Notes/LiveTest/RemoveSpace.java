public class RemoveSpace {
	public static void main(String[] args) {
		String s = "Hello World Java";
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				result += s.charAt(i);
			}
		}

		System.out.println(result);
	}
}
