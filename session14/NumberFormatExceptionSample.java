package session14;

public class NumberFormatExceptionSample {

    public static void main(String[] args) {

     try
    {
           String s = null;
            System.out.println(s.length());
      }
      catch (NullPointerException e)
     {
          System.out.println(e. toString());
      }
        finally
        {
            System.out.println("Finally block");
        }
    }
}
