import java.util.Scanner;

public class JumpingSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        int jumps = sc.nextInt();
        String[] splitedString = numbers.split(" ");
        int step = 0;
        int a = 0;
        int tempSum = 0;
        int lenght = splitedString.length;
        for (int j = 0; j < splitedString.length; j++) {
            int sum = 0;
            sum += Integer.parseInt(splitedString[j]);
            step = (sum + j) % lenght;
            for (int i = 0; i < jumps; i++) {
                a = step;
                int number = Integer.parseInt(splitedString[a]);
                sum += number;
                step = (number + a) % lenght;
            }
            if (sum > tempSum) {
                tempSum = sum;
            }
        }
        System.out.printf("max sum = %d", tempSum);
        sc.close();
    }
}
