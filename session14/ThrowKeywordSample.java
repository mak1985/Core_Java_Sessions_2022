package session14;

public class ThrowKeywordSample {

    public static void main(String[] args) {

        int age = 22;

        if(age >17)
        {
            throw new ArithmeticException("Access Denied");
        }
        else{
            System.out.println("Access Granted");
        }
    }
}
