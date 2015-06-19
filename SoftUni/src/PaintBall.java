import java.util.Scanner;

public class PaintBall {
    private static int[][] fillMatrix() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = fillMatrix();
        String quit = "End";
        String input = "";
        int paint = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            input = sc.nextLine();
            if (input.equals(quit)) {
                break;
            }
            String[] splited = input.split(" ");
            int row = Integer.valueOf(splited[0]);
            int col = 9 - Integer.valueOf(splited[1]);
            int radius = Integer.valueOf(splited[2]);
            int rowBorderStart = row - radius;
            int rowBorderEnd = row + radius;
            int columnBorderStart = col - radius;
            int columnBorderEnd = col + radius;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (i >= rowBorderStart && i <= rowBorderEnd && j >= columnBorderStart && j <= columnBorderEnd) {
                        if (paint % 2 == 0) {
                            matrix[i][j] = 0;
                        } else {
                            matrix[i][j] = 1;
                        }
                    }
                }
            }
            paint++;
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < matrix.length; j++) {
                sb.append(matrix[i][j] + "");
            }
            int decimalNumber = Integer.parseInt(sb.toString(), 2);
            sum += decimalNumber;
        }
        System.out.println(sum);
        sc.close();
    }
}
