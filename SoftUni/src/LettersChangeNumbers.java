import java.util.Scanner;

public class LettersChangeNumbers {
    static Integer getPosition(char c) {
        return (Character.toLowerCase(c) - 'a') + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\W+");
        double result = 0;
        double finalResult = 0;
        for (String string : input) {
            double firstLetter = getPosition(string.charAt(0));
            double secondLetter = getPosition(string.charAt(string.length() - 1));
            double number = Double.parseDouble(string.substring(1, string.length() - 1));
            if (Character.isLowerCase(string.charAt(0))) {
                result = firstLetter * number;
            } else if (Character.isUpperCase(string.charAt(0))) {
                result = number / firstLetter;
            }
            if (Character.isLowerCase(string.charAt(string.length() - 1))) {
                result = secondLetter + result;
            } else if (Character.isUpperCase(string.charAt(string.length() - 1))) {
                result = result - secondLetter;
            }
            finalResult += result;
        }
        System.out.printf("%.2f", finalResult);
        System.out.println("\0xaaa\0aaaa");
        sc.close();
    }
}
