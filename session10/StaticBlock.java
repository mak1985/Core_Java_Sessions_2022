package session10;

public class StaticBlock {


    static //static block
    {
        System.out.println("This is staic block");
    }

     StaticBlock(int a, int b) //constructor
    {
        System.out.println(a+b);
        return;
//        System.out.println("This is constructor");
    }
    StaticBlock()
    {
        System.out.println("fffffffff");
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
        StaticBlock obj = new StaticBlock(10, 11);
        System.out.println("This is main method");
    }
    /*
    Note - Static block will execute first even prior to main method
     */
}
