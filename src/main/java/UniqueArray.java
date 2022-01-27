public class UniqueArray {

    public static void main(String[] args) {
        int allniques =0;
        int[]arr = {1,2,2,3,3,4,4,5,6,7,6,};

        for (int i = 0; i <arr.length ; i++) {
            int count = 0;
            for (int j = 0; j <arr.length; j++) {

                if(arr[i]==arr[j])
                count++;
            }
            if(count ==1){

                System.out.println(arr[i]);

            }
        }



    }



}
