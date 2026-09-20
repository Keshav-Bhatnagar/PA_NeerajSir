public class fibonacci {
	public static void main(String[] args) {
		int terms = 10;
		int first = 0;
		int second = 1;

		for (int i = 1; i <= terms; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
	}
}
