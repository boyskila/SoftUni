import java.util.Scanner;

public class PythagoreanNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] sequence = new int[num];
        boolean flag = true;
        for (int i = 0; i < num; i++) {
            sequence[i] = sc.nextInt();
        }
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence.length; j++) {
                for (int k = 0; k < sequence.length; k++) {
                    if (sequence[i] * sequence[i] + sequence[j] * sequence[j] == sequence[k] * sequence[k]
                            && sequence[i] <= sequence[j]) {
                        System.out.println(sequence[i] + "*" + sequence[i] + "+" + sequence[j] + "*" + sequence[j]
                                + "=" + sequence[k] + "*" + sequence[k]);
                        flag = false;
                    }
                }
            }
        }
        if (flag) {
            System.out.println("No");
        }
        sc.close();
    }
}
