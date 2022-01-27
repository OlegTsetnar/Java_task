package Exceptions_practice;
/**
 *
 * using TRY AND CATCH allows us to handle exceptions with custom message and continue working
 * **/
public class Try_catch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception was handled");
        }

        System.out.println("Hello world");
    }
}