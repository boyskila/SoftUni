import java.util.Scanner;

public class TravellerBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String leap = sc.nextLine();
        int contract = sc.nextInt();
        int family = sc.nextInt();
        int contractsTravels = contract * 12;
        int spendWithFamily = family * 4;
        int normalMonths = (12 - (contract + family)) * 12;
        double normalMonthsTravels = normalMonths * (3.0 / 5.0);
        double resultForLeapYear = (normalMonthsTravels + contractsTravels + spendWithFamily) * 5 / 100;
        double result = leap.equals("leap") ? normalMonthsTravels + contractsTravels + spendWithFamily
                + resultForLeapYear : normalMonthsTravels + contractsTravels + spendWithFamily;
        System.out.println((int) result);
        sc.close();
    }
}
