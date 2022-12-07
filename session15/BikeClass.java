package session15;

public abstract class BikeClass {
    int age;

    //Parent class

    //constructor
    BikeClass()
    {
        System.out.println("Bike Class constructor created");
    }

    //create an abstract method
     abstract void run(); //abstrct method does not have body

    //create non-abstract method
    void start()
    {
        System.out.println("Bike started");
    }

    //create static method
    static void stop()
    {
        System.out.println("Bike stopped");
    }

}
