package session5;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i=1; i<=100; i++)
        {
            if(i==5)
                continue; //skip the matched value and print the below immediate lines of code
            System.out.println(i); // 1 2 3 4 6 7 8 9 10
        }

    }
}
