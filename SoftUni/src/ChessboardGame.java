import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ChessboardGame {
    public static boolean isLowerCaseLetterOrDigit(char c) {
        return Character.isLetter(c) && Character.isLowerCase(c) || Character.isDigit(c);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int size = Integer.valueOf(n);
        String word = sc.nextLine();
        int blackTeamSum = 0;
        int whiteTeamSum = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (i == size * size) {
                break;
            }
            if (i % 2 == 0 && isLowerCaseLetterOrDigit(ch)) {
                blackTeamSum += ch;
            } else if (isLowerCaseLetterOrDigit(ch)) {
                whiteTeamSum += ch;
            } else if (Character.isUpperCase(ch)) {
                if (i % 2 == 0) {
                    whiteTeamSum += ch;
                } else {
                    blackTeamSum += ch;
                }
            }
        }
        if (blackTeamSum == whiteTeamSum) {
            System.out.println("Equal result: " + blackTeamSum);
        } else {
            int diff = Math.abs(whiteTeamSum - blackTeamSum);
            System.out.printf("The winner is: %s%n", blackTeamSum > whiteTeamSum ? "black team" : "white team");
            System.out.println(diff);
        }
        sc.close();
    }
}
