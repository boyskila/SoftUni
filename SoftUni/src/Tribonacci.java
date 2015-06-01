import java.math.BigInteger;
import java.util.Scanner;

public class Tribonacci {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		BigInteger a = BigInteger.valueOf(sc.nextInt());
//		BigInteger b = BigInteger.valueOf(sc.nextInt());
//		BigInteger c = BigInteger.valueOf(sc.nextInt());
//
//		int d = sc.nextInt();
//		if (d == 1) {
//			System.out.println(a);
//		} else if (d == 2) {
//			System.out.println(b);
//		} else if (d == 3) {
//			System.out.println(c);
//		} else {
//
//			BigInteger sum = null;
//			BigInteger secondSum = null;
//			for (int i = 3; i < d; i++) {
//
//				sum = a.add(b);
//				secondSum = sum.add(c);
//
//				a = b;
//				b = c;
//				c = secondSum;
//
//			}
//
//			System.out.println(secondSum);
//		}
		float a = 0;
		for (int i = 0; i < 10; i++) {
			 a  += 0.1;
		}
		System.out.println(a);
	}

}
