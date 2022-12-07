package session8;

public class Calculator {

    /*
    1. syntax of method: modifier returntype nameofmethod(parameter)

     */

    //2. create static method
    static void printMessage() // no return type
    {
        System.out.println("Welcome to Java session");
    }

    //Non-static method with no return
    void printMessage1()
    {
        System.out.println("Welcome to JavaScript session");
    }

    //method to sum two numbers
    static void sum(int a, int b) // parameterized method - no return
    {
        System.out.println("Sum of a & b is : " + (a+b));
    }

    //return type method
    static int sum1(int a, int b) // parameterized method
    {
        return (a+b);

    }

    static int minimum(int a, int b) // parameterized method with return
    {
        if(a<b) // If a is smaller than b
            return a;
        else
            return b; // If b is smaller than a
    }

    public static void main(String[] args) {

        //Calling static method without creating object
        printMessage(); //Welcome to Java session

        Calculator cal = new Calculator(); // Creating an object
        cal.printMessage1();

        sum(10,20); // 10 & 20 arguments passed to sum method

//        int result = sum1(2,5);
        System.out.println(sum1(2, 5));
//        System.out.println("Sum1 of a & b is: " + result);

        System.out.println(minimum (4,8)); // Calling from main method without creating an object

    }

}
