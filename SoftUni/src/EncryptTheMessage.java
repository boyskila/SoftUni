import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EncryptTheMessage {

    static Map<Character, Character> cifers = new HashMap<Character, Character>() {
        /**
         * 
         */
        private static final long serialVersionUID = 1L;

        {
            put('a', 'n');
            put('b', 'o');
            put('c', 'p');
            put('d', 'q');
            put('e', 'r');
            put('f', 's');
            put('g', 't');
            put('h', 'u');
            put('i', 'v');
            put('j', 'w');
            put('k', 'x');
            put('l', 'y');
            put('m', 'z');
            put('n', 'a');
            put('o', 'b');
            put('p', 'c');
            put('q', 'd');
            put('r', 'e');
            put('s', 'f');
            put('t', 'g');
            put('u', 'h');
            put('v', 'i');
            put('w', 'j');
            put('x', 'k');
            put('y', 'l');
            put('z', 'm');
            put(' ', '+');
            put('.', '&');
            put(',', '%');
            put('?', '#');
            put('!', '$');

        }
    };

    public static void main(String[] args) {
        String start = "";
        int counter = 0;
        List<String> cryptedWords = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        while (!start.equals("start"))
            start = sc.next().toLowerCase();

        while (true) {
            String word = sc.nextLine();
            if (word.equals("end") || word.equals("END")) {
                String finalMessage = counter == 0 ? "No messages sent." : "Total number of messages: " + counter + "";
                System.out.println(finalMessage);
                break;
            }
            counter += !word.equals("") ? 1 : 0;
            cryptedWords.add(cryptTheMessage(word));
        }
        for (String cryptedMessage : cryptedWords) {
            if (!cryptedMessage.equals(""))
                System.out.println(cryptedMessage);
        }
        sc.close();
    }

    public static String cryptTheMessage(String message) {
        StringBuilder sb = new StringBuilder();
        for (int i = message.length() - 1; i >= 0; i--) {
            char c = Character.isUpperCase(message.charAt(i)) ? Character.toUpperCase(cifers.get(message.toLowerCase()
                    .charAt(i))) : message.charAt(i);
            char result = Character.isUpperCase(c) ? c : Character.isDigit(c) ? c : cifers.get(c);
            sb.append(result);
        }
        return sb.toString();

    }

}
