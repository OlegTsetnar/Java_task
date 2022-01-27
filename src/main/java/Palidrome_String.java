import java.util.Locale;

public class Palidrome_String {
    public static void main(String[] args) {
        String str= "Abccba";
        System.out.println(isPalindrome(str));

    }
    static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.toLowerCase().charAt(i)!= str.toLowerCase().charAt(j))
                return false;
            i++;
            j--;
        }

        return true;






    }}