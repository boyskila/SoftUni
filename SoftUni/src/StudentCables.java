import java.util.Scanner;

public class StudentCables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfCables = sc.nextInt();
        int m = 0;
        int cm = 0;
        int mCounter = 0;
        for (int j = 0; j < countOfCables; j++) {
            int cableSize = sc.nextInt();
            sc.nextLine();
            String measure = sc.next();
            if (measure.equals("meters")) {
                mCounter++;
                m += cableSize * 100;
            } else {
                if (cableSize >= 20) {
                    mCounter++;
                    cm += cableSize;
                }
            }
        }
        int connection = (mCounter - 1) * 3;
        int cable = cm + m - connection;
        int cablesCount = cable / 504;
        int reminder = cable % 504;
        System.out.printf("%d%n%d", cablesCount, reminder);
        sc.close();
    }
}
