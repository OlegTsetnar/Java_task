import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lady_bug {
    public static void main(String[] args) {

        happyLadybugs("AABB_CC_");
    }

    public static String happyLadybugs(String b) {
        // Write your code here

        String response = "";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < b.length(); i++) {
            Character letter = b.charAt(i);
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> each : map.entrySet()) {

            if (each.getValue() < 2 && !each.getKey().equals('_')) {
                response = "NO";
            }
        }
        if (!map.containsKey('_')) {
            int count = 0;
            char last = b.charAt(0);
            for (int i = 0; i < b.length(); i++) {
                char curr = b.charAt(i);

                if (curr == last) {
                    count++;
                } else {
                    if (count < 2) {
                        response = "NO";

                    } else {
                        count = 1;
                    }
                }
                last = curr;
            }
            response = "Yes";
        } else //It has an _ so it is YES
        {
            response = "YES";
        }

        return response;
    }
}