import java.util.Arrays;

public class MergeArrays {
	public static void main(String[] args) {
		int[] first = {1, 3, 5};
		int[] second = {2, 4, 6};
		int[] merged = new int[first.length + second.length];

		for (int i = 0; i < first.length; i++) {
			merged[i] = first[i];
		}
		for (int i = 0; i < second.length; i++) {
			merged[first.length + i] = second[i];
		}

		System.out.println(Arrays.toString(merged));
	}
}
