package session4;

public class SwitchCaseSample {

    public static void main(String[] args) {

        /**
         * switch case statement
         * syntax:
         * switch(expression)
         * {
         * case value1:
         * statement-1;
         * break; //optional use to exit from the program
         *
         * case value2
         * statement-2;
         * break;
         *
         * default:
         *
         */

        int age = 18;
        switch (age)
        {
            case 100:
                System.out.println("I am senior citizen");
                break;

            case 5:
                System.out.println("I am a kid");
                break;

            case 18:
                System.out.println("I am adult");
                break;

            default:
                System.out.println("Wrong input");
                break;
        }

    }
}
