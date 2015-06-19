import java.util.Scanner;

public class InsideTheBuilding {
    static String check(int h, int x, int y) {
        String result = null;
        int lenght = h * 3;
        int hight = h * 4;
        if (x <= lenght && x >= 0 && y >= 0 && y <= h || x >= h && x <= lenght - h && y <= hight && y >= h) {
            result = "inside";
        } else {
            result = "outside";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int x5 = sc.nextInt();
        int y5 = sc.nextInt();
        System.out.println(check(h, x1, y1));
        System.out.println(check(h, x2, y2));
        System.out.println(check(h, x3, y3));
        System.out.println(check(h, x4, y4));
        System.out.println(check(h, x5, y5));
        sc.close();
    }
}
