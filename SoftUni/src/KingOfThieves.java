import java.util.Scanner;

public class KingOfThieves {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String symbol = sc.nextLine();
        int size = Integer.valueOf(n);
        for (int i = 0; i < (size / 2) + 1; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(j >= size / 2 - i && j <= size / 2 + i || i == (size / 2) + 1 ? symbol : "-");
            }
            System.out.println();
        }
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(j > i && j < size - 1 - i ? symbol : "-");
            }
            System.out.println();
        }
        sc.close();
    }
}
