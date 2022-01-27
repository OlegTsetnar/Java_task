import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;
public class Max_Value_in_Map {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 4);
        map.put(2, 5);
        map.put(3, 7);
        map.put(4, 2);
        System.out.println(map.entrySet());

       int maxValueInMap =  Collections.max(map.values());  //find max value
       System.out.println(maxValueInMap);

       for (Map.Entry<Integer,Integer> each: map.entrySet()){    //Iterate through HashMap and print Key

           if (each.getValue()==maxValueInMap){
               System.out.println(each.getKey());
           }
       }

       
        }
    }



