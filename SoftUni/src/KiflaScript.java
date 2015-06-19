
public class KiflaScript {
    public static void main(String[] args) {
        System.out.println("N = ");
        int n = 5;
        int[][] matrix = new int[10][10];
        FillMatrix(matrix, n);
        PrintMatrix(matrix, n);
    }

    private static void FillMatrix(int[][] matrix, int n) {
        int positionX = n / 2;
        int positionY = n % 2 == 0 ? (n / 2) - 1 : (n / 2);
        int direction = 0;
        int stepsCount = 1;
        int stepPosition = 0;
        int stepChange = 0;
        for (int i = 0; i < n * n; i++) {
            matrix[positionY][positionX] = i;
            if (stepPosition < stepsCount) {
                stepPosition++;
            } else {
                stepPosition = 1;
                if (stepChange == 1) {
                    stepsCount++;
                }
                stepChange = (stepChange + 1) % 2;
                direction = (direction + 1) % 4;
            }
            switch (direction) {
                case 0:
                    positionY++;
                    break;
                case 1:
                    positionX--;
                    break;
                case 2:
                    positionY--;
                    break;
                case 3:
                    positionX++;
                    break;
            }
        }
    }

    private static void PrintMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}