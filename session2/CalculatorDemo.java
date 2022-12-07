package session2;

public class CalculatorDemo {

    public static void main(String[] args) {

        //1. Arithmetic operators ( + ; -; *; /; %, ++; --)

        int a = 10;
        int b = 5;

//        System.out.println("Addition : "+ (a+b)); //15
//        System.out.println(a-b); //5
//        System.out.println(a*b); //50
//        System.out.println(a/b); //2
//        System.out.println(a%b); //0

//        //++ increment operators
//        System.out.println("increment operators: " + a++); //print 10
//        System.out.println(a++);//10+1=11
//        System.out.println(a);//12
//
//        //++a
//        System.out.println(++a);//1+12= 13

        // -- decrement/increment operators
        System.out.println(b--);//current value ---------5
        System.out.println(b);//5-1=4
        System.out.println(b++);//
        System.out.println(b);//5
        System.out.println(--b);//4
        System.out.println(b);//4

    }
}
