public class countfreqWithouHash {
	public static void main(String[] args) {
		int[] numbers = {4, 2, 4, 3, 2, 4};
		boolean[] counted = new boolean[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			if (counted[i]) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
					counted[j] = true;
				}
			}
			System.out.println(numbers[i] + " -> " + count);
		}
	}
}
