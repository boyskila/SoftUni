public class MostCommonElement {

	public static void main(String[] args) {
		int[] digits = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 1, 1, 1, 2, 4, 9, 9, 3 };
		int tempResult = 0;
		int count = 0;
		int mostCommonElement = 0;

		for (int i = 0; i < digits.length; i++) {

			int counter = 0;

			for (int j = i; j < digits.length; j++) {

				if (digits[i] == digits[j]) {

					tempResult = digits[j];
					counter++;

				}

				if (j + 1 == digits.length) {

					if (count < counter) {
						count = counter;
						mostCommonElement = tempResult;

					}

				}
			}
		}
		System.out.printf(mostCommonElement + "(%d times)", count);

	}
}
