import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String movieType = sc.nextLine();

		int rows = sc.nextInt();
		int col = sc.nextInt();
		double result = 0;

		if (movieType.equals("Premiere")) {

			System.out.printf("%.2f leva", (rows * col) * 12.00);
		}
		if (movieType.equals("Normal")) {

			System.out.printf("%.2f leva", (rows * col) * 7.50);
		}
		if (movieType.equals("Discount")) {

			System.out.printf("%.2f leva", (rows * col) * 5.00);
		}

	}

}
