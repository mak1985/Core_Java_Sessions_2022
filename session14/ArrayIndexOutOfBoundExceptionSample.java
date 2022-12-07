package session14;

public class ArrayIndexOutOfBoundExceptionSample {

    public static void main(String[] args) {

        int a[] = new int[5];
        try
        {
            a[4] = 6;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
