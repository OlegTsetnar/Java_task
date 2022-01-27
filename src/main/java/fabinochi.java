public class fabinochi {


    public static void main(String[] args) {

fab(8);



    }
public static void fab(int n){

        int [] result = new int[n+1];
result[1]=1;
    for (int i = 0; i <= result.length-3 ; i++) {
        System.out.println(result [i+2] = result[i]+result[i+1]);
    }
    System.out.println(result.length-1);

}

}
