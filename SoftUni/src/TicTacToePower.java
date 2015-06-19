import java.util.Scanner;

public class TicTacToePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();
        int index = sc.nextInt();
        int currentIndex = 0;
        long findedIndex = 0;
        int getIndex = 0;
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = index++;
                getIndex++;
                if (matrix[i][j] == matrix[row][col]) {
                    currentIndex = index - 1;
                    findedIndex = currentIndex;
                    break;
                }
            }
            if (currentIndex > 0) {
                break;
            }
        }
        for (int i = 0; i < getIndex - 1; i++) {
            findedIndex *= currentIndex;
        }
        System.out.println(findedIndex);
        sc.close();
    }
}
