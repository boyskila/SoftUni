import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfEnteredNumbers = sc.nextInt();

		int firstRow = 0;
		int enteredNumbers = 0;
		int secondRow = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < numberOfEnteredNumbers; j++) {

				enteredNumbers += sc.nextInt();
				if (i == 0) {
					firstRow = enteredNumbers;

				} else {
					secondRow = enteredNumbers;

				}

			}
			enteredNumbers = 0;
		}
		if (firstRow == secondRow) {
			System.out.println("Yes, sum=" + firstRow);
		} else {
			System.out.println("No, diff=" + Math.abs(secondRow - firstRow));
		}

	}
}
