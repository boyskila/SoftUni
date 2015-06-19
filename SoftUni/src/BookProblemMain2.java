import java.util.Scanner;

public class BookProblemMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookPages = sc.nextInt();
        int campDays = sc.nextInt();
        int numberOfReadedPages = sc.nextInt();
        if (campDays == 30 || numberOfReadedPages == 0) {
            System.out.println("never");
        }
        int normalDays = 30 - campDays;
        int readedPagesPerMonth = normalDays * numberOfReadedPages;
        int neededTime = (int) Math.ceil((double) bookPages / readedPagesPerMonth);
        int years = neededTime / 12;
        int month = neededTime % 12;
        System.out.printf("%d years %d months", years, month);
        sc.close();
    }
}
