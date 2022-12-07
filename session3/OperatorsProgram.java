package session3;

public class OperatorsProgram {
    public static void main(String[] args) {
        //1.Arithmetic Operator - Addition; Subtraction; Multiplication; Division; Modulo;
        //Divides the left operand with the right operand and returns the remainder
        int A = 10;
        int B = 20;
        System.out.println (A + B);//30
        System.out.println (A - B);//-10
        System.out.println (A * B);//200
        System.out.println (A / B);//0
        System.out.println (A % B);//10

        //2.Assignment Operator - assignment operator is used to assign the value on its right to the operand on its left
        // =;
        int a = 10;
        int b = 20;
        int c;
        System.out.println (c = a); // Output =10

        //3.Relational Operator - relationship between two operands and returns the Boolean results--> ==; !=; <; <=; >; >=
        int price = 10;
        int amount = 20;
        System.out.println (a == b); // returns false because 10 is not equal to 20
        System.out.println (a != b); // returns true because 10 is not equal to 20
        System.out.println (a > b); // returns false
        System.out.println (a < b); // returns true
        System.out.println (a >= b); // returns false
        System.out.println (a <= b); // returns true

        //4.Logical Operator ---> || (OR) and && (AND)
        // || retruns ----It returns true if either of the Boolean expressions is true.
        // && retruns ---> It returns true if all the Boolean Expressions are true
        int apple = 10;
        int orrange = 20;

        System.out.println (apple < 10 & apple < orrange);  //returns false
        System.out.println (apple < 10 || apple < orrange);  //returns true
        System.out.println (!(apple < 10 & apple < orrange)); //returns true

        //5.Ternary Operator ----Condition ? if true : if false
        //Syntax: varibale = (condition) ? expression1 : expression 2
        int i = 50;
        int l = 100;

        int minimum = i <l ? i:l;
        System.out.println(minimum);

    }
}
