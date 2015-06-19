public class SequenceWhithRepeatingElements {
    public static void main(String[] args) {
        int[] integers = { 2, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 1 };
        int from = 0;
        int to = 0;
        int counter = 1;
        int check = 0;
        for (int i = 0; i < integers.length; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[i] != integers[j]) {
                    counter = 1;
                    break;
                } else {
                    counter++;
                    if (counter > check) {
                        check = counter;
                        from = i;
                        to = j;
                        if (integers[j] != integers[j + 1]) {
                            counter = 1;
                            break;
                        }
                    }
                }
            }
        }
        for (int i = from; i <= to; i++) {
            System.out.println(integers[i]);
        }
    }
}
