package Const;

import java.util.ArrayList;
import java.util.List;

public class Car {


    private String name;
    private int id;


    public List<String> parts;


    public Car(String name, int id) {             //constructor
        this.name = name;
        this.id = id;

    }

    public Car(String name ){                   //overloading constructor
        this.name = name;
        this.parts = new ArrayList<>();

    }

    public void addMember(String newMember){        //add extra method
        parts.add(newMember);
    }
    public void removeMember(String Member){      //one more extra method
        parts.remove(Member);
    }




    public void setName(String name) {          //setter
        this.name = name;
    }
    public void setId(int id) {                    //setter
        this.id = id;
    }
    public String getName() {                  //getter
        return name;
    }
    public int getId() {                         //getter
        return id;
    }
    public List<String> getParts() {                 //getter
        return parts;
    }
    public void setParts(List<String> parts) {        //setter
        this.parts = parts;
    }
    @Override
    public String toString() {                  //toString
        return "Car{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", parts=" + parts +
                '}';
    }
}