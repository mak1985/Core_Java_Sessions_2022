package session3;

public class StringConcatenation {

    public static void main(String[] args) {

        //String ---> Non-primitive datatype, also it's a class
        String str1 = "Hello";
        String str2 = "Java";

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(str1+ " "+str2); //Hello Java
        System.out.println("My total values is :"+a+b+c);// My total values is : 30
        System.out.println("My total values is :" + (a+b+c)); //60
    }
}
