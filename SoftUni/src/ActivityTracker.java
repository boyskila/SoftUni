import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ActivityTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        // String[] input = new String[count];
        Map<Integer, Map<String, Integer>> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String[] input = sc.nextLine().split(" ");
            String[] date = input[0].split("/");
            int mont = Integer.parseInt(date[1]);
            String name = input[1];
            int score = Integer.parseInt(input[2]);
            if (!map.containsKey(mont)) {
                Map<String, Integer> user = new HashMap<String, Integer>();
                user.put(name, score);
                map.put(mont, user);
            } else {
                // check if the user is already present or not and act
                // accordingly
                Map<String, Integer> user = map.get(mont);
                if (!user.containsKey(name)) {
                    user.put(name, score);
                } else {
                    int tempDistance = user.get(name);
                    tempDistance += score;
                    user.put(name, tempDistance);
                }
                map.put(mont, user);
            }
        }
        for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
            Map.Entry month = (Map.Entry) it.next();
            String outputLine = month.getKey() + ": ";
            Map user = (Map) month.getValue();
            for (Iterator it2 = user.entrySet().iterator(); it2.hasNext();) {
                Map.Entry users = (Map.Entry) it2.next();

                outputLine += users.getKey() + "(" + users.getValue() + "), ";
            }
            outputLine = outputLine.substring(0, outputLine.length() - 2);
            System.out.println(outputLine);
        }
        sc.close();
    }
}
