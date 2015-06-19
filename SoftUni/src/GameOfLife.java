import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pairsCount = sc.nextInt();
        int[][] matrix = new int[10][10];
        for (int i = 0; i < pairsCount; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            matrix[a][9 - b] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
