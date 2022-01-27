package Const;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_Car {
    public static void main(String[] args) {

Const.Car car1 = new Const.Car("Toyota", 2015);   //garbage collector
car1 = new Const.Car("Nissan",2016);            //new object
Const.Car car2 = new Const.Car("Infiniti",2016);    //new object
Const.Car car3 = new Const.Car("BMW",2020);            //new object
        System.out.println(car1.toString());



        Const.Car[] cars = {car1,car2,car3, new Const.Car("Mercedes", 2021)};  //Array of objects


        for (int i = 0; i < cars.length; i++) {     //print each object in Array
            System.out.println(cars[i]);

        }
        List<Const.Car>objects = new ArrayList<>(Arrays.asList(car1,car2,car3, new Const.Car("Honda",2021)));  // List of objects
        System.out.println(objects);

        Const.Car parts_Vehicles = new Car("Toyota_Parts");    //2nd overloading constructor
        parts_Vehicles.addMember("Engine");                // add_method of each element
        parts_Vehicles.addMember("Brakepads");
        parts_Vehicles.addMember("Glass");

        System.out.println(parts_Vehicles.getParts().size());     //size
        System.out.println(parts_Vehicles.toString());

        parts_Vehicles.removeMember("Glass");              //remove method of each element
        System.out.println(parts_Vehicles.toString());




    }
}