package session13;
import java.lang.ArithmeticException;

public class TryCatchSample {
    public static void main(String[] args) {
        try
        {
            int result = 100/0;

        }
        catch (ArithmeticException e)
        {
            System.out.println(e.toString());
        }

        System.out.println("Code pass");
        System.out.println("Code pass");
        System.out.println("Code pass");
        System.out.println("Code pass");
        System.out.println("Code pass");
        System.out.println("Code pass");
    }



}
