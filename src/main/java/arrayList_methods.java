import java.util.*;

public class arrayList_methods {

    public static void main(String[] args) {


        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Collections.reverse(arr);
        Collections.replaceAll(arr,5,6);
 int max = Collections.max(arr);
        System.out.println(max);

        System.out.println(arr);

        arr.add(8);
        System.out.println(arr);
        arr.remove(6);
        System.out.println(arr);
        arr.set(2,11);
        System.out.println(arr);

        List <String> str = new ArrayList<>(Arrays.asList("Oleg","Ivanna","Ceasar","Daizy","Ivanna","Ceasar","Daizy"));

     Collections.reverse(str);

     String duplicate;
     List <String> uniqe = new ArrayList<>();
for (String each : str){
    if (Collections.frequency(str, each) >1){

     uniqe.add(each);



    }



}





   String [] arr3 = uniqe.toArray(new String[0]);

        System.out.println(Arrays.toString(arr3));
       int num = arr3.length;
        System.out.println(num);








    }
}