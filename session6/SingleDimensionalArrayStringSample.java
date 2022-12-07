package session6;

public class SingleDimensionalArrayStringSample {
    public static void main(String[] args) {
        String [] language = {"Java", "JavaScript", "Python", "TypeScript", "C#"};
        System.out.println("Size of an array : " + language.length);
        System.out.println("Value of 3th element: " + language[2]);
        System.out.println("Value of 1st element: " + language[0]);
        for (String i:language)
        {
            System.out.println("For each loop: " + i);
        }
    }
}
