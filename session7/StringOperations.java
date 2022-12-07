package session7;

public class StringOperations {
    public static void main (String [] args)
    {
        String s = "Hello Java";

//        //1. char charAt (int index) ----> Returns char value for particular index
        System.out.println(s.charAt(0));//H
//
//        //2. int length() -----> Returns String lenght
        System.out.println(s.length());//10
//
//        //3. String toLowerCase() ------> Returns String in lowercase
        System.out.println(s.toLowerCase());//hello java
//
//        //4. StringtoUpperCase() -------> Returns String in uppercase
        System.out.println(s.toUpperCase());//HELLO JAVA
//
//        //5. String replace (char oldChar, char newChar) ------> Replace old character with new character value in string
        System.out.println(s.replace('J', 'T'));//Hello Tava
        System.out.println(s.replace("Java", "JavaScript"));//Hello JavaScript
//
//        //6. int indexOf(char ch) -------> Returns index of specified character
        System.out.println(s.indexOf('v'));
//
//        //7. String substring (int startIndex) ------> Returns substring for given start index
        System.out.println(s.substring(6)); // o Java
//
//        //8. boolean isEmpty() ---------> checks if String is empty
        System.out.println(s.isEmpty());//
//
//        //9. String substring (int startIndex, int endIndex) ------> Returns a new string that is a substring of this string
        s = "WELCOME TO CODING";
        System.out.println(s.substring(11,17));//CODING
//
//        //10. boolean contains() ------> checks if string contains the specified character sequence
        System.out.println(s.contains("CODING")); //true

        //11 & 12. startsWith() & endWith()----->
        String a = "char charAt (int index) ----> Returns char value for particular index";
        System.out.println(a.startsWith("char"));
//
        System.out.println(a.endsWith("index"));

        //equals method ----> compare between two arguments
        String s1 = "Welcome";
        String s2 = "WelCome";
//        System.out.println("Is s1 equals to s2 ? : "+ s1.equals(s2));

        //equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s2));

        //Concatenates method-
        s1 = "Welcome";
        s2 = "Java";
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat("TypeScript"));
        System.out.println(s1.concat("C#"));
        System.out.println(s1+s2);

        //String trim() -----> Omits leading and trailing white spaces
        String b = "               I am a developer              ";
        System.out.println(b.trim());

    }

}
