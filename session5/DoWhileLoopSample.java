package session5;

public class DoWhileLoopSample {

    public static void main(String[] args) {

        /*
        Syntax:
        do
        {
            code to be executed
            incrment/decrement ++ --
        }
        while (condition)
        {

        }
         */

        //print odd number using do while loop
        int i = 1;

        do
        {
            System.out.println("value of i:" + i);//0
            i = i+2;
        }
        while (i<=10);//2,4,6,8,10

//        System.out.println("do while loop exit and get the value of i: " + i); //10
    }
}
