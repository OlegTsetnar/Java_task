package Const.Composition;


import com.sun.xml.internal.ws.api.pipe.Engine;

public class Bus {               //composition   same like Webdriver Driver;
    Glass glass;                  // When class has instance variable of type of other class, Has-A relation
    Driver driver;                // Bus Has-A driver;  Bus Has-A glass;

    @Override
    public String toString() {
        return glass.getGlass_num() + " / "+driver.getName();    // can add toString method
    }
}
