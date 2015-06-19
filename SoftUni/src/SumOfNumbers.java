import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfEnteredNumbers = sc.nextInt();
        int firstRow = 0;
        int secondRow = 0;
        for (int i = 0; i < 2; i++) {
            int enteredNumbers = 0;
            for (int j = 0; j < numberOfEnteredNumbers; j++) {
                enteredNumbers += sc.nextInt();
                if (i == 0) {
                    firstRow = enteredNumbers;
                } else {
                    secondRow = enteredNumbers;
                }
            }
        }
        String result = firstRow == secondRow ? String.format("Yes, sum=%d", firstRow) : String.format("No, diff="
                + Math.abs(secondRow - firstRow));
        System.out.println(result);
        sc.close();
    }
}
