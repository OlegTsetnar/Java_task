package StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
static int num ;
    static {
num =10;
List<String> list = new ArrayList <>(Arrays.asList("Ceasar","Ivanna","Oleg"));

        System.out.println("Static Block"+ list);
    }

  public StaticBlockDemo(){
num+=5;
      System.out.println("Constructor");
  }

}
