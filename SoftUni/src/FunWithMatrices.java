import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FunWithMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        String end = "Game Over!";
        String inputNumbers = sc.nextLine();
        double inputNumber = Double.valueOf(inputNumbers);
        String step = sc.nextLine();
        double stepp = Double.valueOf(step);
        double[][] matrix = fillMatrix(inputNumber, stepp);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        while (!input.equals(end)) {
            input = sc.nextLine();
            String[] str = null;
            String result = "";
            int row = 0;
            int col = 0;
            double number = 0.0;
            if (!input.equals(end)) {
                result = input.replaceAll(" (multiply|sum|power) ", " ");
                str = result.split(" ");
                row = Integer.valueOf(str[0]);
                col = Integer.valueOf(str[1]);
                number = Double.valueOf(str[2]);
            }
            double n = matrix[row][col];
            if (input.contains("multiply")) {
                matrix[row][col] = n * number;
                System.out.println("RES" + number * n);
            } else if (input.contains("sum")) {
                matrix[row][col] = n + number;
            } else if (input.contains("power")) {
                System.out.println("before " + matrix[row][col]);
                matrix[row][col] = Math.pow(n, Math.abs(number));
                System.out.println("after " + matrix[row][col]);
            }
        }
        double result = checkWichSumIsBigger(matrix);
        System.out.println(String.format("%.2f", result));
        sc.close();
    }

    public static double[][] fillMatrix(double inputValue, double step) {
        double[][] matrix = new double[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == 0 && i == 0) {
                    matrix[i][j] = inputValue;
                } else {
                    inputValue -= Math.abs(step);
                    inputValue = Math.round(inputValue * 100.0) / 100.0;
                    matrix[i][j] = inputValue;
                }
            }
        }
        return matrix;
    }

    private static double checkWichSumIsBigger(double[][] matrix) {
        List<Double> l = new ArrayList<>();
        double rowSum = 0;
        double rowSumTemp = 0;
        double colSum = 0;
        double colSumTemp = 0;
        for (int i = 0; i < matrix.length; i++) {
            rowSumTemp = 0;
            colSumTemp = 0;
            for (int j = 0; j < matrix.length; j++) {
                rowSumTemp += matrix[i][j];
                colSumTemp += matrix[j][i];
            }
            if (rowSum < rowSumTemp) {
                rowSum = rowSumTemp;
            }
            if (colSum < colSumTemp) {
                colSum = colSumTemp;
            }
        }
        System.out.println();
        System.out.println(matrix[0][0] + matrix[0][1] + matrix[0][2] + matrix[0][3]);
        System.out.println();
        double leftD = matrix[0][3] + matrix[1][2] + matrix[2][1] + matrix[3][0];
        double rightD = matrix[0][0] + matrix[1][1] + matrix[2][2] + matrix[3][3];
        l.add(leftD);
        l.add(rightD);
        l.add(rowSum);
        l.add(colSum);
        Collections.sort(l);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        return l.get(l.size() - 1);
    }
}
