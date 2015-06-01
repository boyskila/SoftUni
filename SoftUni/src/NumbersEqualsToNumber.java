import java.util.Scanner;

public class NumbersEqualsToNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int result = 0;
		int from = 0;
		int to = 0;

		int[] numbers = { 4, 3, 1, 4, 2, 5, 8 };

		for (int i = 0; i < numbers.length; i++) {
			result = 0;
			for (int j = i; j < numbers.length; j++) {

				result += numbers[j];

				if (result == number) {
					from = i;
					to = j;
					break;
				}

			}
			if (result == number) {
				break;
			}
		}
		for (int i = from; i <= to; i++) {
			System.out.println(numbers[i]);
		}
	}

}
