import java.util.Scanner;

public class AddingAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int insertNumbers = sc.nextInt();
        int[] angles = new int[insertNumbers];
        int counter = 0;
        for (int i = 0; i < angles.length; i++) {
            angles[i] = sc.nextInt();
        }
        for (int i = 0; i < angles.length; i++) {
            for (int j = i + 1; j < angles.length; j++) {
                for (int j2 = j + 1; j2 < angles.length; j2++) {
                    int result = angles[i] + angles[j] + angles[j2];
                    if (result % 360 == 0) {
                        System.out.println(angles[i] + " + " + angles[j] + " + " + angles[j2] + " = " + result);
                        counter++;
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("No");
        }
        sc.close();
    }
}
