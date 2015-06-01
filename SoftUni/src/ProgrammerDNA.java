import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrammerDNA {
	static String alphabet = "abcdefg".toUpperCase();
	static int letterCounter = 0;
	static char[] letter = alphabet.toCharArray();

	static Integer findLetterPosition(char letterIn) {

		int counter = 0;

		for (char c : letter) {
			counter++;
			if (c == Character.toUpperCase(letterIn)) {
				break;
			}

		}

		return counter;
	}

	static char pattern[] = { 
		0, 0, 0, 0, 1, 1, 1, 2, 
		0, 0, 0, 1, 1, 1, 0, 2, 
		0, 0, 1, 1, 1, 0, 0, 2,
		0, 1, 1, 1, 0, 0, 0, 2, 
		1, 1, 1, 0, 0, 0, 0, 2, 
		};
//	
//	INDEX = y * sizex + x;
//	2 * 8 + 3
//	x = INDEX % sizex
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dnaSize = sc.nextInt();
		char letterIn = sc.next().trim().charAt(0);

		int position = findLetterPosition(letterIn) - 1;
		int line = 0;
		int pattern_pos = 0;
		while (line < dnaSize) {

			char command = pattern[pattern_pos++];
			if (pattern_pos >= pattern.length)
				pattern_pos = 0;
			switch (command) {
			case 0:
				System.out.print('.');
				break;
			case 1:
				System.out.print(letter[position++]);
				if (position >= letter.length)
					position = 0;
				break;
			case 2:
				System.out.println();
				line++;
				break;
			}
		}
	}
	// public static void main(String[] args) {
	//
	// Scanner sc = new Scanner(System.in);
	// int dnaSize = sc.nextInt();
	// char letterIn = sc.next().trim().charAt(0);
	//
	// int position = findLetterPosition(letterIn) - 1;
	// int rowsCounter = 0;
	// do {
	//
	// for (int i = 0; i <= letter.length / 2; i++) {
	// for (int j = 0; j < letter.length; j++) {
	//
	// if (position == letter.length) {
	// position = 0;
	// }
	//
	// if (j >= letter.length / 2 - i
	// && j <= letter.length / 2 + i) {
	// System.out.print(letter[position]);
	//
	// position++;
	// }
	//
	// else {
	// System.out.print('.');
	// }
	//
	// }
	// System.out.println();
	// rowsCounter++;
	// if (rowsCounter == dnaSize) {
	// break;
	// }
	//
	// }
	// if (rowsCounter == dnaSize) {
	// break;
	// }
	// for (int i = 0; i < (letter.length / 2); i++) {
	// for (int j = 0; j < letter.length; j++) {
	// if (position == letter.length) {
	// position = 0;
	// }
	// if (j > i && j < (letter.length - i) - 1) {
	// System.out.print(letter[position]);
	// position++;
	// } else {
	// System.out.print('.');
	// }
	//
	// }
	// System.out.println();
	// rowsCounter++;
	// if (rowsCounter == dnaSize) {
	// break;
	// }
	//
	// }
	//
	// } while (rowsCounter <= dnaSize);
	// }
}
