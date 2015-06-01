import java.util.Scanner;

public class OddOrEvenCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfSets = sc.nextInt();
        int setSize = sc.nextInt();
        String evenOrOdd = sc.next();

        int setCounter = 1;
        int numbers = 0;
        int buffer = Integer.MIN_VALUE;
        int set = 0;
        int oddOrEven = evenOrOdd.equals("odd") ? 1 : 0;

        for (int i = 1; i <= numOfSets; i++) {
            numbers = 0;
            for (int j = 0; j < setSize; j++) {
                int nums = sc.nextInt();
                if (nums % 2 == oddOrEven) {
                    numbers++;
                    if (numbers > buffer) {
                        buffer = numbers;
                        set = i;
                    }
                }
            }
        }
        String str = null;

        switch (set) {
            case 1:
                str = "First";
                break;
            case 2:
                str = "Second";
                break;
            case 3:
                str = "Third";
                break;
            case 4:
                str = "Fourth";
                break;
            case 5:
                str = "Fifth";
                break;
            case 6:
                str = "Sixth";
                break;
            case 7:
                str = "Seventh";
                break;
            case 8:
                str = "Eight";
                break;
            case 9:
                str = "Ninth";
                break;
            case 10:
                str = "Tenth";
                break;
            default:
                break;
        }
        System.out.println(setCounter > 0 ? String.format("%s set has the most %s numbers: %d", str, evenOrOdd, buffer)
                : "No");
        sc.close();
    }
}
