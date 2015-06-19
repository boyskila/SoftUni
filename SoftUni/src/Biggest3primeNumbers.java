import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Biggest3primeNumbers {
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().replaceAll(" ", "").split("[()]+");
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("")) {
                int a = Integer.parseInt(input[i]);
                if (isPrime(a) && a > 1 && !list.contains(a)) {
                    list.add(a);
                }
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        if (list.size() < 3) {
            System.out.println("No");
        } else {
            int sum = list.get(0) + list.get(1) + list.get(2);
            System.out.println(sum);
        }
        sc.close();
    }
}
