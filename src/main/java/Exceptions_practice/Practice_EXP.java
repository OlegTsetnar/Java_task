package Exceptions_practice;

import java.util.Scanner;

/**
 *  "throw new" --> if equal Oleg  // stop the code
 * **/
public class Practice_EXP {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String name  = input.next();
if (name == null || name.equals("Oleg")) {
    throw new IllegalArgumentException("name is not valid");
       }
System.out.println(name);


/**
 *  "throw new" --> age in rage // stop the code
 * **/

int age = input.nextInt();

if(age<18 || age>30 ){
    throw new IllegalArgumentException("age is not in correct range");
}


    }
}
