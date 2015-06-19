import java.util.Scanner;

public class HeadPhones {
    private static void printUpperPart(int size) {
        int devidedSize = size / 2;
        int newSize = size * 2 + 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < newSize; j++) {
                if (i == 0 && j >= devidedSize && j < newSize - devidedSize || i > 0 && j == devidedSize
                        || j == newSize - devidedSize - 1) {
                    System.out.print('*');
                } else {
                    System.out.print('-');
                }
            }
            System.out.println();
        }
    }

    private static void printTriangleUpperPart(int size) {
        int devidedSize = size / 2;
        int newSize = size * 2 + 1;
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = 0; j < newSize; j++) {
                if (j >= size / 2 - i && j < newSize - size - devidedSize + i - 1 || j > newSize - devidedSize - 2 - i
                        && j < newSize - devidedSize + i) {
                    System.out.print('*');
                } else {
                    System.out.print('-');
                }
            }
            System.out.println();
        }
    }

    private static void printTriangleLowerPart(int size) {
        int newSize = size * 2 + 1;
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < newSize; j++) {
                if (j > i && j < newSize - size - 2 - i || j > newSize - size + i && j < newSize - i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print('-');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        printUpperPart(size);
        printTriangleUpperPart(size);
        printTriangleLowerPart(size);
        sc.close();
    }
}
