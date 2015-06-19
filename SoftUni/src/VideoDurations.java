import java.util.Scanner;

public class VideoDurations {
    public static void main(String[] args) {
        int minutes = 0;
        int seconds = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String duration = sc.nextLine();
            if (duration.equals("End")) {
                break;
            }
            String[] time = duration.split(":");
            minutes += Integer.parseInt(time[0]);
            seconds += Integer.parseInt(time[1]);
        }
        minutes += seconds / 60;
        seconds %= 60;
        System.out.printf("%d:%02d", minutes, seconds);
        sc.close();
    }
}
