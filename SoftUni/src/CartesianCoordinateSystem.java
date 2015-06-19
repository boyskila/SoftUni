import java.util.Scanner;

public class CartesianCoordinateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("0");
        }
        if (x > 0 && y > 0) {
            System.out.println("1");
        }
        if (x < 0 && y > 0) {
            System.out.println("2");
        }
        if (x < 0 && y < 0) {
            System.out.println("3");
        }
        if (x > 0 && y < 0) {
            System.out.println("4");
        }
        if (x == 0 && y > 0 || x == 0 && y < 0) {
            System.out.println("5");
        }
        if (y == 0 && x > 0 || y == 0 && x < 0) {
            System.out.println("6");
        }
        sc.close();
    }
}
