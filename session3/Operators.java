package session3;

public class Operators {

    public static void main(String[] args) {
        //Relational operators ==; !=; >; <; >=; <=
        //returns true or false statement
//        int a = 10;
//        int c = 1;
//        System.out.println(a); //10
//
////        int c=0;
////        System.out.println(c); //0
//
//        a=c;
//        System.out.println(a);//10

//        int b = 20;

        //Assignment operator ---> =

         //
         //

//        System.out.println(a==b); //false using ==;
//        System.out.println(a!=b); //true using !=
//        System.out.println(a>b); //false
//        System.out.println(a<b); //true
//        System.out.println(a>=b);//false
//        System.out.println(a<=b);//true

        //Logical Operators ---> &&; ||; !;
        //boolean value
        boolean x = false;
        boolean y = false;

//        System.out.println(x&&y); //true only if both x and y are true ---then it will return true
//        System.out.println(x||y); // true if either x or y is true
//        System.out.println(); //true if x is false vice versa
//        System.out.println(!(5 ==3)); //true
//        System.out.println(5!=3); //true
//        System.out.println(!(5 >3));//false

        //Conditional Operators / ternary operator
        //Syntax: varibale = (condition) ? expression1 : expression 2
        int a = 50;
        int b = 100;

        int minimum = a <b ? a:b;
        System.out.println(minimum);

        int febDays = 29;
        String result;

        result = (febDays == 29) ? "Not a leap year" : "Leap year";
        System.out.println(result);//Leap year
    }
}
