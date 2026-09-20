public class prime_no_range {
	public static void main(String[] args) {
		int start = 10;
		int end = 30;

		for (int number = start; number <= end; number++) {
			if (number < 2) {
				continue;
			}

			boolean prime = true;
			for (int divisor = 2; divisor <= number / divisor; divisor++) {
				if (number % divisor == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.print(number + " ");
			}
		}
	}
}
