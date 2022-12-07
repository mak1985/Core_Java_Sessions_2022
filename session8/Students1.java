package session8;

public class Students1 {

    //instance variables
    String name; //declarations
    int rollNo; //declarations

    //method to insert record
    public void insertRecord(String studentName, int studentRoll)
    {
        name = studentName;
        rollNo = studentRoll;
    }

    //method to display information
    public void displayInformation()
    {
        System.out.println(name);
        System.out.println(rollNo);
    }

    public static void main(String[] args) {

        //create an object - ClassName
        Students1 student1Obj = new Students1();
        Students1 student1Obj1 = new Students1();

        //initialize object
        student1Obj.insertRecord("John", 101);
        student1Obj1.insertRecord("Paul", 102);

        //print student information
        student1Obj.displayInformation();
        student1Obj1.displayInformation();

    }
}
