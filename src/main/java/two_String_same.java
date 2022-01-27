import java.util.Arrays;

public class two_String_same {

    public static void main(String[] args) {
        same("abc","cab");
    }
    public static boolean same(String a, String b){

        char [] ch1 = a.toCharArray();
        char [] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String newA="";
        String newB="";

        for (char each: ch1) {
            newA += each;
        }
        for (char each: ch2) {
            newA += each;
        }
        System.out.println(newA+newB);
        return newA.equals(newB);

    }

}
