import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_combine_2 {

    public static void main(String[] args) {

        String [] arr1 = {"aaa","bbb","ccc"};
        String [] arr2 = {"ddd","eee","fff"};

        String []arr3 =new String [arr1.length+ arr2.length];
        int i = 0;
        for (String each:
            arr1 ) {
            arr3[i] = each;
            i++;
        }
        for (String each:
                arr2 ) {
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));

}}
