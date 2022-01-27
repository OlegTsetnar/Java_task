import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class apples_oranges {
    public static void main(String[] args) {
        List <Integer> apples = new ArrayList<>(Arrays.asList(3,-5,6,4));
        List <Integer> oranges = new ArrayList<>(Arrays.asList(8,-5,-2,8));
        countApplesAndOranges(3,7,10,3,apples,oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int apple  = 0;
        int orange = 0;

        for (int i = 0; i < apples.size(); i++) {
            int sum = a + apples.get(i);
            if (sum >= s && sum <= t) {
                apple++;

            }

        }
        System.out.println(apple);

        for (int i = 0; i < oranges.size(); i++) {
            int sum = b + oranges.get(i);
            if (sum >= s && sum <= t) {
                orange++;
            }
        }
        System.out.println(orange);

    }}