package session5;

public class WhileLoopDemo {
    public static void main(String[] args) {
    /*
    syntax:
        while(condition)
        {
            code
        }
     */
//        int x = 10;//2,3,4
//
//        //Exit when x becomes grater than 4
//        while (x <=20)
//        {
//            System.out.println("Value of x:" + x);
//            x=x+5;
//
//            //x++; //Increment the value of x for
//            //next iteration
//        }

        //print integer value from 1 - 10 using while loop
        int i = 1;// initialization
        while (i<=5){ //condition
            System.out.println("value of i: "+i);i++;
        } // increment the value by 1

        System.out.println("while loop exits. Value of i is: "+ i);//11
    }
}
