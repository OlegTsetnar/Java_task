import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.*;

public class migration_birds {

    public static int migration (List <Integer > arr){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <arr.size() ; i++) {
       int count = arr.get(i);

           if (map.containsKey(count)){
               map.put(count,map.get(count)+1);   //if exist just increase a count

            }
           else {
               map.put(count,1);    // if unique just put 1
           }
        }

        System.out.println(map);

        int coun_repeat = (Collections.max(map.entrySet(),Comparator.comparing(Map.Entry::getValue)).getKey());

return coun_repeat;


    }

    public static void main(String[] args) {
        List birds_migratin = Arrays.asList(1,2,2,3,3,3,4,4);
        System.out.println(migration(birds_migratin));
    }
}
