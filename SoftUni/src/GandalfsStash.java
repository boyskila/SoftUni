import java.util.Scanner;

public class GandalfsStash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mood = Integer.parseInt(sc.nextLine());
        String[] givenFoods = sc.nextLine().toLowerCase().split("[^a-zA-Z]+");
        int result = mood;
        for (String string : givenFoods) {
            if (string.equals("cram")) {
                result += 2;
            } else if (string.equals("lembas")) {
                result += 3;
            } else if (string.equals("apple")) {
                result += 1;
            } else if (string.equals("melon")) {
                result += 1;
            } else if (string.equals("honeycake")) {
                result += 5;
            } else if (string.equals("mushrooms")) {
                result -= 10;
            } else {
                result -= 1;
            }
        }
        if (result < -5)
            System.out.println(result + "\n" + "Angry");
        else if (result >= -5 && result < 0)
            System.out.println(result + "\n" + "Sad");
        else if (result >= 0 && result <= 15)
            System.out.println(result + "\n" + "Happy");
        else if (result > 15)
            System.out.println(result + "\n" + "Special JavaScript mood");
        sc.close();
    }
}
