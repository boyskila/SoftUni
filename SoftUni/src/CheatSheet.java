import java.util.Scanner;

public class CheatSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        long verticalNumber = sc.nextLong();
        long horizontalNumber = sc.nextLong();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d ", (verticalNumber + i) * (horizontalNumber + j));
            }
            System.out.println();
        }
        sc.close();
    }
}
