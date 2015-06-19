import java.util.Scanner;

public class NewHouse {
    static void printRoof(int input) {
        for (int i = 0; i < input / 2 + 1; i++) {
            for (int j = 0; j < input; j++) {
                if (j < input / 2 - i || j > input / 2 + i) {
                    System.out.print('-');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    static void printWalls(int input) {
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (j == 0 || j == input - 1) {
                    System.out.print('|');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printRoof(input);
        printWalls(input);
        sc.close();
    }
}
