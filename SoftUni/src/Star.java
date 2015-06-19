import java.util.Scanner;

public class Star {

    static void printUpperPart(int hight, int width) {
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                if (j == width / 2 - i || j == width / 2 + i) {
                    System.out.print('*');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }

    static void printMiddlePart(int hight, int width) {
        for (int i = 0; i < hight - 1; i++) {
            for (int j = 0; j < width; j++) {

                if (j == i + 1 || j == width - i - 2) {
                    System.out.print('*');
                } else {
                    System.out.print('.');
                }

            }
            System.out.println();
        }
    }

    static void printLine(int width, int hight) {
        for (int i = 0; i < width; i++) {
            if (i < hight + 1 || i > width - (hight + 2)) {
                System.out.print('*');
            } else {
                System.out.print('.');
            }
        }
    }

    static void printLowerPart(int hight, int width, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < width; j++) {
                if (j == n / 2 - i || j == width / 2 - i || j == width / 2 + i || j == (width / 2 + i) + n / 2) {
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
        int n = sc.nextInt();
        int width = 2 * n + 1;
        int hight = n / 2;
        printUpperPart(hight, width);
        printLine(width, hight);
        System.out.println();
        printMiddlePart(hight, width);
        printLowerPart(hight, width, n);
        printLine(width, hight);
        sc.close();
    }
}
