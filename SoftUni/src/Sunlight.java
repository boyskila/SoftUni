import java.util.Scanner;

public class Sunlight {
    public static void printFirstAndLastLine(int n) {
        int rowLenght = n * 3;
        for (int j = 0; j < rowLenght; j++) {
            char c = j == rowLenght / 2 ? '*' : '.';
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int rowLenght = n * 3;
        char c;
        
        printFirstAndLastLine(n);
        System.out.println();
        for (int i = 1; i < n; i++) {
            for (int k = 0; k < rowLenght; k++) {
                c = k == i || k == rowLenght - 1 - i || k == rowLenght / 2 ? '*' : '.';
                System.out.print(c);
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int k = 0; k < rowLenght; k++) {
                c = k > n - 1 && k < rowLenght - n || i == n / 2 ? '*' : '.';
                System.out.print(c);
            }
            System.out.println();
        }

        for (int i = 1; i < n ; i++) {
            for (int k = 0; k < rowLenght; k++) {
                c = k == n - 1 - i || k == rowLenght / 2 || k == rowLenght - n + i ? '*' : '.';
                System.out.print(c);
            }
            System.out.println();
        }
        printFirstAndLastLine(n);
        sc.close();
    }
}
