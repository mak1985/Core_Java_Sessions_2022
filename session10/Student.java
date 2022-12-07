package session10;

public class Student
{
    int roll; //non static var
    String studentName; //non static var
    static String collegeName = "Jai Hind College"; //static var

    public static void main(String[] args) {

        Student student1 = new Student(); //created object for the class
        student1.roll=6;
        student1.studentName="John";
        System.out.println(student1.roll + " "+ student1.studentName);
        System.out.println(collegeName);

        Student student2 = new Student();
        student2.roll=7;
        student2.studentName="Paul";
        System.out.println(student2.roll + " " + student2.studentName);
        System.out.println(collegeName);

    }

}
