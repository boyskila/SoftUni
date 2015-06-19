public class IncrementSequence {

    public static void main(String[] args) {
        int[] integers = { 2, 1, 2, 3, 4, 5, 6, 1, 11, 3, 3, 4, 2 };
        int from = 0;
        int to = 0;
        int counter = 1;
        int check = 0;
        for (int i = 0; i < integers.length; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[i] >= integers[j]) {
                    counter = 1;
                    break;
                } else if (integers[i] == integers[j] - counter) {
                    counter++;
                    if (counter > check) {
                        check = counter;
                        from = i;
                        to = j;
                    }
                } else {
                    counter = 1;
                    break;
                }
            }
        }
        for (int i = from; i <= to; i++) {
            System.out.println(integers[i]);
        }
    }
}
