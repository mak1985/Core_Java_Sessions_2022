package session14;

import java.io.IOException;

public class ThrowsKeyword {

    static void checkAge(int age) throws ArithmeticException,IndexOutOfBoundsException, IOException,ArrayIndexOutOfBoundsException, NullPointerException
    {
        if(age < 18)
        {
            throw new ArithmeticException("Access denied");
        }
        else
        {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            checkAge(18);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        System.out.println("Rest of the code");
    }

}
