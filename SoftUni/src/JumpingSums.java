import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JumpingSums {

	static Integer findIndex(int indexPosition, int[] nums, int indexValue) {
		int[] numbers = new int[indexValue + 1];
		int position = 0;
		for (int j = 0, a = 0; j < numbers.length; j++, a++) {
			if (a == nums.length || indexPosition == nums.length) {
				indexPosition = 0;
				a = 0;
			}
			numbers[j] = nums[indexPosition++];

			position = a;

		}
		return position;

	}

	static Long findSum(int k, long sum, long result, int[] nums, int jumps) {

		for (int i = 0, j = 0; i <= jumps; i++, j++) {

			if (sum > nums.length - k) {
				sum = findIndex(k, nums, nums[k]);
				result = findSum(k, sum, result, nums, jumps) - k;

			}
			if (sum >= nums.length) {
				result += sum;
				sum = 0;
			}
			sum += nums[(int) sum];

		}
		result += sum;
		return result;

	}

	public static void main(String[] args) {

		List<Integer> sums = new ArrayList<Integer>();

		// Scanner sc = new Scanner(System.in);
		// String[] numbers = sc.nextLine().trim().split(" ");
		// int jumps = sc.nextInt();
		int jumps = 4;
		int[] nums = { 1, 2, 3, 5 };
		// int[] nums = new int[numbers.length];
		//
		// for (int i = 0; i < numbers.length; i++) {
		// nums[i] = Integer.parseInt(numbers[i]);
		//
		// }

		long sum = 0;
		long result = 0;
		int check = 0;
		long goTo = 0;
		long currentIndex = 0;

		for (int k = 0, j = 0; k < nums.length; k++, j++) {
			sum = k;

			if (k == nums.length - 1) {
				if (nums[(int) sum] > nums.length - k) {
					sum = findIndex(k, nums, nums[k]);
				}
				findSum(k, sum, result, nums, jumps);
			}
			if (nums[(int) sum] > nums.length - k && k != nums.length - 1) {

				sum = findIndex(k, nums, nums[k]);

				result = findSum(k, sum, result, nums, jumps) - k;

			} else {

				result = findSum(k, sum, result, nums, jumps) - k;
			}
			sums.add((int) result);
			result = 0;
			sum = 0;

		}

		for (int i : sums) {
			System.out.printf("%d ", i);
		}
	}
}
