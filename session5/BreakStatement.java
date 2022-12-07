package session5;

import session12.MultiLevelInheritanceCode;


public class BreakStatement extends MultiLevelInheritanceCode {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++)
        {
            if(i==5) //4
                break; //Exit from the loop
            System.out.println(i);
        }//for loop ends
    }
}
