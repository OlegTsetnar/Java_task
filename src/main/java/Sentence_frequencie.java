import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sentence_frequencie {


    public static void main(String[] args) {

        String str = "I am happy and why not and why are you not happy you should be";
        String [] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        //for (int i=0 ; i < arr.length ; i++){

//            if (!map.containsKey(arr[i])){
//                map.put(arr[i],1);
//            } else{
//                map.put(arr[i],map.get(arr[i])+1);
//            }
//        }
//        for(Map.Entry<String, Integer> each :
//                map.entrySet() ) {
//
//            System.out.println(each.getKey() + " occures " + each.getValue() + " times");
//        }


Map<String,Integer> map2 = new HashMap<>();

        for (int i=0; i<arr.length; i++){

            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else { map.put(arr[i],map.get(arr[i])+1);

        }}

for (Map.Entry<String,Integer> each: map.entrySet()){

    System.out.println(each.getKey()+" "+ each.getValue());
}

    }}