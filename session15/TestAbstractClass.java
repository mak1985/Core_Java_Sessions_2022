package session15;

public class TestAbstractClass {

    public static void main(String[] args) {

        //create an object
        BikeClass obj = new TVS();
        obj.run(); // abstract method
        obj.start(); //non-abstract method
        BikeClass.stop(); //Calling static method from different class

        BikeClass obj1 = new Honda();
        obj1.run();// abstract method
        obj1.start();//non-abstract method
        BikeClass.stop();//Calling static method from different class

        BikeClass obj2 = new Yamaha();
        obj1.run();// abstract method
        obj1.start();//non-abstract method
        BikeClass.stop();//Calling static method from different class
    }
}
