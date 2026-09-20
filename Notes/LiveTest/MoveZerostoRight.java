import java.util.Arrays;

public class MoveZerostoRight {
	public static void main(String[] args) {
		int[] numbers = {0, 1, 0, 3, 12};
		int nextPosition = 0;

		for (int number : numbers) {
			if (number != 0) {
				numbers[nextPosition++] = number;
			}
		}
		while (nextPosition < numbers.length) {
			numbers[nextPosition++] = 0;
		}

		System.out.println(Arrays.toString(numbers));
	}
}
