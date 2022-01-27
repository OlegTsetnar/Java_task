package Inheritance;

public class Person extends Human{
String name;
int age;

public Person (String name, int age, String location){
    super(location);

}
    @Override
    public void walk() {          //same name and same param, return type the same or covariant type, Access modifier is same or more visible
        super.walk();
        System.out.println("Walk inside");
    }

    @Override
    public void speak() {     //same name and same param, return type the same or covariant type, Access modifier is same or more visible

        System.out.println("french");
    }
}
