package session11;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
//        System.out.println("Enter user name");
        //create an object of scanner class
        Scanner obj = new Scanner(System.in);
        //String input for name
//        String name = obj.nextLine();
//        System.out.println("Enter user age");
//        int age = obj.nextInt();
//        System.out.println("Name is :" + name);
//
//        System.out.println("Age is :" + age);

        double salary = obj.nextDouble();
        System.out.println("Salary" + salary);
    }
}
