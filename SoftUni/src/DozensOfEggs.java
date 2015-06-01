import java.util.Scanner;

public class DozensOfEggs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sumOfEggs = 0;
		int eggs = 0;

		for (int i = 0; i < 7; i++) {
			String[] input = sc.nextLine().split(" ");

			if (input[1].toLowerCase().equals("eggs")) {
				sumOfEggs = Integer.parseInt(input[0]);
			} else if (input[1].toLowerCase().equals("dozens")) {
				sumOfEggs = Integer.parseInt(input[0]) * 12;
			}

			eggs += sumOfEggs;

		}
		int doz = eggs / 12;
		eggs = eggs % 12;

		System.out.println(doz + " dozens + " + eggs + " eggs");

	}
}
