import java.util.Scanner;

public class Boat {
    static int pointsCounter = 0;

    static void printUpperPart(int input) {
        int lenght = input * 2;
        for (int i = 0; i < input; i++) {
            for (int j = 1; j < lenght + 1; j++) {
                if (j < lenght / 2 - pointsCounter || j > input) {
                    System.out.print('.');
                } else {
                    System.out.print('*');
                }
            }
            if (i < input / 2) {
                pointsCounter += 2;
            } else {
                pointsCounter -= 2;
            }
            System.out.println();
        }
    }

    static void printLowerPart(int input) {
        for (int i = 0; i < input / 2; i++) {
            for (int j = 0; j < input * 2; j++) {
                if (j >= i && j < input * 2 - i) {
                    System.out.print('*');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        printUpperPart(input);
        printLowerPart(input);
        sc.close();
    }
}
