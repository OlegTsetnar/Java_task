import Inheritance.Human;
import Inheritance.Person;

import java.util.*;

public class Comperator_Interface {
    public static void main(String[] args) {

        List <String> pr = new ArrayList<>(Arrays.asList("Oleg","Ivanna","Ceasar"));

        System.out.println(pr);
        Collections.sort(pr);

        Comparator<String> comp = Comparator.comparing(p -> p.length());
        Collections.sort(pr,comp);


        String [] arr = pr.toArray(new String[0]);  // convert ArrayList --> to Array;
        System.out.println(Arrays.toString(arr));

    }


}
