package StaticBlock;

public class StaticBlock_Test {
    public static void main(String[] args) {


        StaticBlockDemo demo1 = new StaticBlockDemo();  //will run static block + constructor   block 10+ const 5
        StaticBlockDemo demo2 = new StaticBlockDemo();  // will run constructor                 +5
        System.out.println(demo2.num);                                                          //20


    }
}