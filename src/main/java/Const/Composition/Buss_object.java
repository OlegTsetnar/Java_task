package Const.Composition;

public class Buss_object {
    public static void main(String[] args) {

        Bus bus = new Bus();                    //new object  (if we run it we will get null_pointer_Exeption)
        bus.driver = new Driver("Oleg");  // we need to create new Driver and new Glass
        bus.glass  = new Glass(25);
        System.out.println(bus.toString());


        Bus metrobus = new Bus();
        metrobus.driver = new Driver("Ceasar");  // we need to create new Driver and new Glass
        metrobus.glass  = new Glass(30);
        System.out.println(metrobus.toString());


    }
}
