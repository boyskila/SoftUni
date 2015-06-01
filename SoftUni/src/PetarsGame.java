import java.util.Scanner;

public class PetarsGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        String str = sc.next();
        long sum = 0;

        for (long i = a; i < b; i++) {

            sum += i % 5 == 0 ? i : i % 5;

        }

        String s = Long.toString(sum);
        char c = sum % 2 == 0 ? s.charAt(0) : s.charAt(s.length() - 1);
        System.out.print(s.replaceAll(c+"", str));
        sc.close();
    }
}
