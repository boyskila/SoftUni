import java.util.Scanner;

public class LegoBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arrayRows = sc.nextLine();
        int rows = Integer.valueOf(arrayRows);
        int[][] arrayA = loadArray(sc, rows);
        int[][] arrayB = loadArray(sc, rows);
        String result = areFit(arrayA, arrayB) ? printArrays(arrayA, arrayB) : String.format(
                "The total number of cells is: %d", countNumberOfCells(arrayA, arrayB));
        System.out.println(result);
    }

    // count number of cells if arrays not fit
    public static int countNumberOfCells(int[][] arrA, int[][] arrB) {
        int sum = 0;
        for (int i = 0; i < arrA.length; i++) {
            sum += (arrA[i].length + arrB[i].length);
        }
        return sum;
    }

    // checking that arrays fit..they fit if all rows lenght are same
    public static boolean areFit(int[][] arrA, int[][] arrB) {
        int sum = arrA[0].length + arrB[0].length;
        for (int i = 1; i < arrA.length; i++) {
            if (arrA[i].length + arrB[i].length != sum) {
                return false;
            }
        }
        return true;
    }

    public static String printArrays(int[][] arrA, int[][] arrB) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrA.length; i++) {
            sb.append('[');
            for (int j = 0; j < arrA[i].length; j++) {
                sb.append(arrA[i][j] + ", ");
            }
            // append second array in reversed order
            for (int q = arrB[i].length - 1; q >= 0; q--) {
                int number = arrB[i][q];
                String s = q > 0 ? String.format("%d, ", number) : number + "";
                sb.append(s);
            }
            sb.append("]\n");
        }
        return sb.toString();
    }

    public static int[][] loadArray(Scanner sc, int row) {
        int[][] result = new int[row][];
        for (int i = 0; i < row; i++) {
            String numbers = sc.nextLine().trim();
            String[] tempArray = numbers.split("\\s+");
            // set row size
            result[i] = new int[tempArray.length];
            for (int j = 0; j < tempArray.length; j++) {
                result[i][j] = Integer.parseInt(tempArray[j]);
            }
        }
        return result;
    }
}
