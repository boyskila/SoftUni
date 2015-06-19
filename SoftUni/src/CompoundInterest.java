import java.math.BigDecimal;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal productPrice = sc.nextBigDecimal();
        int numberOfYears = sc.nextInt();
        BigDecimal bankLoanRate = calculateInterestRate(productPrice, sc.nextBigDecimal(), numberOfYears);
        BigDecimal friendLoanRate = calculateInterestRate(productPrice, sc.nextBigDecimal(), 1);
        String result = bankLoanRate.compareTo(friendLoanRate) < 0 ? String.format("%.2f Bank", bankLoanRate) : String
                .format("%.2f Friend", friendLoanRate);
        System.out.println(result);
        sc.close();
    }

    public static BigDecimal calculateInterestRate(BigDecimal productPrice, BigDecimal interestRate, int year) {
        interestRate = interestRate.add(new BigDecimal(1));
        interestRate = interestRate.pow(year);
        interestRate = interestRate.multiply(productPrice);
        return interestRate;
    }
}
