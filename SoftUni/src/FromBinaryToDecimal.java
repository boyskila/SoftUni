import java.util.Scanner;

public class FromBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] binary = sc.next().split("");
        int result2 = 0;
        for (int i = 0; i < binary.length; i++) {
            if (Integer.parseInt(binary[i]) > 0) {
                int result = 0;
                result = Integer.parseInt(binary[i]);
                for (int j = 1; j < binary.length - i; j++) {
                    result *= 2;
                }
                result2 += result;
            }
        }
        System.out.println(result2);
        sc.close();
    }
}
