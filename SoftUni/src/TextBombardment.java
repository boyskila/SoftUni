import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TextBombardment {
	static String printMatrix(char[][] matrix, int rows, int columns) {

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				builder.append(matrix[i][j]);

			}
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();
		int columns = sc.nextInt();
		sc.nextLine();
		String[] col = sc.nextLine().split(" ");

		char[] txt = text.toCharArray();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < col.length; i++) {

			list.add(Integer.parseInt(col[i]));

		}
		int rows = txt.length / columns + 1;

		char[][] matrix = new char[rows][columns];
		for (int row = 0, letter = 0; row < rows; row++) {

			for (int column = 0; letter < txt.length && column < columns; column++, letter++) {
				matrix[row][column] = ' ';
				if (list.contains(column)
						&& Character.isWhitespace(txt[letter]) && row > 0) {

					if (!Character.isWhitespace(txt[letter - columns])) {

						txt[letter] = 0;
					}

				}
				if (row > 0) {
					if (txt[letter - columns] == 0) {
						matrix[row][column] = txt[letter];
					}
				}

				if (!list.contains(column)) {

					matrix[row][column] = txt[letter];

					if (Character.isWhitespace(txt[letter])) {
						txt[letter] = 0;
					}
				}

			}
		}

		String str = printMatrix(matrix, rows, columns).trim();
		System.out.println(str);
	}
}
