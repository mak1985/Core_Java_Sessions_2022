package session11;

/**
 * In method overloading, multiple methods can have the same name
 * but must have different parameters numbers and different parameter data types
 */

public class MethodOverloadingDemo {

    void add (int a, int b)
    {
        System.out.println("1st method :" + (a+b)); //30
    }

    void add (double a, double b) //300.0
    {
        System.out.println("2nd method : " + (a+b));
    }

    void add (int a, double b) //30.0
    {
        System.out.println("3rd method : " + (a+b));
    }

    void add (int a, int b, int c, double d) //100.0
    {
        System.out.println("4th method :" + (a+b+c+d));
    }


    public static void main(String[] args) {

        MethodOverloadingDemo obj = new MethodOverloadingDemo(); // Created an object of the class
        obj.add(10,20);
        obj.add(100.0, 200.0);
        obj.add(10, 20.0);
        obj.add(10, 20, 30, 40.0);

    }
}
