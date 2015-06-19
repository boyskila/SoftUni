import java.util.Scanner;

public class SpirallMatrix {

    public static char[][] getSpiralArray(int matrixSize, String word) {
        int size = word.length();
        char[][] spiralArray = new char[matrixSize][matrixSize];
        int j;
        int sideLen = matrixSize;
        int currNum = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (j = 0; j < sideLen; j++) {
                currNum = currNum == size ? 0 : currNum++;
                spiralArray[i][i + j] = word.charAt(currNum++);
            }
            for (j = 1; j < sideLen; j++) {
                currNum = currNum == size ? 0 : currNum++;
                spiralArray[i + j][matrixSize - 1 - i] = word.charAt(currNum++);
            }
            for (j = sideLen - 2; j > -1; j--) {
                currNum = currNum == size ? 0 : currNum++;
                spiralArray[matrixSize - 1 - i][i + j] = word.charAt(currNum++);
            }
            for (j = sideLen - 2; j > 0; j--) {
                currNum = currNum == size ? 0 : currNum++;
                spiralArray[i + j][i] = word.charAt(currNum++);
            }
            sideLen -= 2;
        }
        return spiralArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        String word = sc.next().toLowerCase();
        int tempSum = 0;
        int sum = 0;
        int rowIndex = 0;
        char[][] letters = getSpiralArray(matrixSize, word);
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                char letter = letters[i][j];
                tempSum += (letter - 96) * 10;
            }
            if (tempSum > sum) {
                rowIndex = i;
                sum = tempSum;
            }
            tempSum = 0;
        }
        System.out.printf("%d - %d", rowIndex, sum);
        sc.close();
    }
}
