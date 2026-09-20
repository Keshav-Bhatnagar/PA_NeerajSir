public class pattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i <= 3) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
			} else {
				for (int j = i; j >= 1; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
