import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FromDecimalTobinary {

	static int[] binary(int number) {
		return null;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char charInput = sc.next().charAt(0);
		int decimal = (int) charInput;
		System.out.printf("The code of %s in ASCII is %d ", charInput, decimal);
		List<Integer> result = new ArrayList<Integer>();
		while (decimal > 0) {

			int binary = decimal % 2;
			decimal = decimal / 2;
			result.add(binary);

		}
		System.out.print("\nHis binary represantation is ");
		for (int i = result.size() - 1; i >= 0; i--) {
			System.out.print(result.get(i));
		}

	}
}
