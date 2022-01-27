import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class count_max {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 4, 7, 5, 1, 3, 5,7,7,7));
        System.out.println(birthdayCakeCandles(arr));
    }
        public static int birthdayCakeCandles(List<Integer> candles){
        int max = candles.get(0);
        int count = 0;

        for (int i = 0; i <candles.size(); i++) {
            if (candles.get(i)>max ) {
                max = candles.get(i);
            }
        }
      for (int i = 0; i <candles.size(); i++){
              if (max==candles.get(i) ) {
                   count++;
               }}
      return count;
    }}
