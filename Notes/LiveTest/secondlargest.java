public class secondlargest {
	public static void main(String[] args) {
		int[] numbers = {10, 5, 8, 10, 7};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int number : numbers) {
			if (number > largest) {
				secondLargest = largest;
				largest = number;
			} else if (number > secondLargest && number < largest) {
				secondLargest = number;
			}
		}

		System.out.println(secondLargest);
	}
}
