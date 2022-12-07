package session8;

public class Students
{
    // 1. By refference variavle

    //instance variables
    String name; //declarations
    int rollNo; //declarations

//method to display information
    public void displayInformation()
    {
        System.out.println(name);
        System.out.println(rollNo);
    }

    public static void main(String[] args) {

        Students obj1 = new Students(); // creating an object of a class - 1st time
        Students obj2 = new Students(); //creating an object of a class - 2nd time

        //initialize object/store  data to the object students class
        obj1.name = "John";
        obj1.rollNo = 10;

        obj2.name = "Butler";
        obj2.rollNo = 11;


        //print information of student 1 & student 2
        obj1.displayInformation(); //John, 10
        obj2.displayInformation();

    }
}
