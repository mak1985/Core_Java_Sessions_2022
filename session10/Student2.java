package session10;

public class Student2 {

    //class variables
    int roll; // non-static
    String studentName;

    static String collegeName= "Jai Hind College";

    Student2(int rollno, String name)
    {
        //parameterizes constructor
        roll = rollno;
        studentName = name;
    }

    void display()
    {
        System.out.println(studentName+roll+collegeName);
    }

    //static method to change the value of college name
    static void changeValue()
    {
        collegeName = "Junior College";
    }

    static int value(int a, int b)
    {
        return (a+b);
    }

    public static void main(String[] args) {
        Student2 obj = new Student2(10, "Raghu");
        Student2 obj2 = new Student2(11, "Vinod");
        obj.display();
        obj2.display();
        System.out.println("After college name changed");
        changeValue();
        value(10, 20);
    }
}
