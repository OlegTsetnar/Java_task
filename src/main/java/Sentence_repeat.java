import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sentence_repeat {
    public static void main(String[] args) {

String str  = "Qween King Qween Prins";
        Map<String, Integer> map = new HashMap<>();

        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

for (int i = 0; i<arr.length; i++){
    if (map.get(arr[i]) == null) {
        map.put(arr[i], 1);
    } else {
        map.put(arr[i], map.get(arr[i])+ 1);
}
}
System.out.println(map.entrySet());

    }
}