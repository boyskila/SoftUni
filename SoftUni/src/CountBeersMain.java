import java.util.Scanner;

public class CountBeersMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String end = "End";
        String input = "";
        int stack = 0;
        int beer = 0;
        while (!input.equals(end)) {
            input = sc.nextLine();
            if (input.contains("stacks")) {
                input = input.replaceAll("\\D+", "");
                stack += Integer.valueOf(input);

            } else if (input.contains("beers")) {
                input = input.replaceAll("\\D+", "");
                beer += Integer.valueOf(input);
            }
        }
        if (beer >= 20) {
            stack += beer / 20;
            beer = beer % 20;
        }
        System.out.printf("%d stacks + %d beers", stack, beer);
        sc.close();
    }
}
