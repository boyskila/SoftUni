import java.util.Scanner;

public class BabaTincheAirlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstClass = sc.nextLine().split(" ");
        String[] businessClass = sc.nextLine().split(" ");
        String[] economyClass = sc.nextLine().split(" ");
        // FirstClass
        int fClassFrequentPassengers = Integer.parseInt(firstClass[1]);
        int fClassPassengersEatingMeal = Integer.parseInt(firstClass[2]);
        int fClassPassengers = Integer.parseInt(firstClass[0]) - fClassPassengersEatingMeal - fClassFrequentPassengers;
        int sumOfFirstClassTickets = (fClassPassengers * 7000) + (fClassFrequentPassengers * 2100)
                + (fClassPassengersEatingMeal * 7035);
        int maxFclassProfit = 12 * 7035;
        // BusinessClass
        int bClassFrequentPassengers = Integer.parseInt(businessClass[1]);
        int bClassPassengersEatingMeal = Integer.parseInt(businessClass[2]);
        int bClassPassengers = Integer.parseInt(businessClass[0]) - bClassFrequentPassengers
                - bClassPassengersEatingMeal;

        int sumOfBusinessClassTickets = (int) ((bClassPassengers * 3500) + (bClassFrequentPassengers * 1050) + (bClassPassengersEatingMeal * 3517.5));
        int maxBclassProfit = (int) ((int) 28 * 3517.5);
        // EconomyClass
        int eClassFrequentPassengers = Integer.parseInt(economyClass[1]);
        int eClassPassengersEatingMeal = Integer.parseInt(economyClass[2]);
        int eClassPassengers = Integer.parseInt(economyClass[0]) - eClassFrequentPassengers
                - eClassPassengersEatingMeal;
        int sumOfEconomyClassTickets = (eClassPassengers * 1000) + (eClassFrequentPassengers * 300)
                + (eClassPassengersEatingMeal * 1005);
        int maxEclassProfit = 50 * 1005;
        int income = sumOfFirstClassTickets + sumOfBusinessClassTickets + sumOfEconomyClassTickets;
        int maxPossibleProfit = maxFclassProfit + maxBclassProfit + maxEclassProfit;
        System.out.println(income);
        System.out.println(maxPossibleProfit - income);
        sc.close();

    }
}
