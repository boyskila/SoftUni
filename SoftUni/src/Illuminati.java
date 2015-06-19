import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Illuminati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secreteMessage = sc.nextLine().toUpperCase();
        List<Character> chars = new ArrayList<Character>();
        int result = 0;
        int counter = 0;
        for (Character ch : secreteMessage.toCharArray()) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                chars.add(ch);
            }
        }
        chars.add('Z');
        Collections.sort(chars);
        for (int i = 1; i < chars.size(); i++) {
            counter++;
            if (chars.get(i - 1) != chars.get(i)) {
                result += (int) chars.get(i - 1) * counter;
                counter = 0;
            }
        }
        System.out.println(chars.size() - 1);
        System.out.println(result);
        sc.close();
    }
}
