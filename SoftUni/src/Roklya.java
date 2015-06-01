import java.util.Scanner;

public class Roklya {
    static void printUpperPart(int width, int n) {
        for (int i = 0, a = 2; i < n / 2; i++, a += 2) {
            for (int j = 0; j < width; j++) {
                String str = j == width / 3 - a || j == (width - n - 1) + a ? "*" : ".";
                System.out.print(str);
            }
            System.out.println();
        }
    }

    static void printMiddlePart(int width, int n) {
        for (int i = 0, a = 0; i < n / 2; i++, a += 2) {
            for (int j = 0; j < width; j++) {
                String str = j == 0 || j == ((n - 1) - a) || j == n - 1 || j == width - 1 || j == width - n
                        || j == width - n + a ? "*" : ".";
                System.out.print(str);
            }
            System.out.println();
        }
    }

    static void printLowerPart(int width, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < width; j++) {
                String str = i < n - 1 ? j == n - 1 - i || j == width - n + i ? "*" : "." : "*";
                System.out.print(str);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int width = 3 * n;
        for (int i = 0; i < width; i++) {
            String str = i < width / 3 || i >= width - n ? "." : "*";
            System.out.print(str);
        }
        System.out.println();
        printUpperPart(width, n);
        printMiddlePart(width, n);
        printLowerPart(width, n);
        sc.close();

    }
}
