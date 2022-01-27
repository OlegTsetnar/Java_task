package Inheritance;

public class test {
    public static void main(String[] args) {

    Person person = new Person("Oleg",35,"USA");
person.walk();              //override method from parent class      same name and same param, return type the same or covariant type, Access modifier is same or more visible
person.speak();             //override method from parent class      same name and same param, return type the same or covariant type, Access modifier is same or more visible
person.age = 35;
person.name = "Oleg";
person.location = "USA";     // have access to parent variable

        System.out.println(person.name +" "+ person.age+ " "+ person.location);

Human human  = new Human("USA");
human.speak();
human.walk();
human.location = "World";

        System.out.println(human.location);


}  }

