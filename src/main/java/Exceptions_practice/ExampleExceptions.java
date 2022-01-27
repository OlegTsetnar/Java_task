package Exceptions_practice;

public class ExampleExceptions {
    public static void main(String[] args) {

        System.out.println("A");    // if A--> failed it will throw exception and stop a code
        try{
            System.out.println("B"); // if B --> failed it will allow to run  just A, D, E (B, C will not run)
            System.out.println("C"); // if C --> failed it will allow to run  just A, B, D, E (C will not run)
        }
        catch (Exception e){
            // catch(Exception ignore)   --> it will swallow errors and execute all codes
            System.out.println("D");  // if C --> failed then try to catch it, but D-->failed too
        }                             // it will run just A, B and than stop a program

        System.out.println("E");      // if E --> failed, it will run A,B,C,D
    }
}
