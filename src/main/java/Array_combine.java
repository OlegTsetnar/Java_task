import java.util.Arrays;

public class Array_combine {
    public static void main(String[] args) {

   String [] arr1 = {"aaa","bbb","ccc"};
        String [] arr2 = {"ddd","eee","fff"};


        String []arr3 =new String [arr1.length+ arr2.length];


        for (int i = 0; i <arr3.length ; i++) {
            if (i<arr1.length){

                arr3[i] = arr1[i];
            }
            else {
                arr3[i] = arr2[i-arr1.length];
            }

        }
        System.out.println(Arrays.toString(arr3));
    }

    }









