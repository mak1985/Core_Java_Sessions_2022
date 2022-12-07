package session9;

public class ConstructorDemo {

    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo();//creating an object
        System.out.println(obj.x); // print the value of x

    }

    int x; //attribute of class

    //Constructor without parameter
    ConstructorDemo()
    {
        //initialize object
        x=10; // initialize the value within Constructor
        System.out.println("Constructor is special");
    }


}
