package session23;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {
    public static void main(String[] args) {
        //Hashtable ht = new Hashtable();
        Hashtable<Integer, String> languages = new Hashtable<>();
        languages.put(6,"No Lang");
        languages.put(2,"JavaScript");
        languages.put(1, "Java");
        languages.put(4, "C++");
        languages.put(3, "Python");
        languages.put(5, "TypeScript");
        System.out.println(languages); //{5=TypeScript, 4=C++, 3=Python, 2=JavaScript, 1=Java}
//        languages.put(null, "VBScript");
//        System.out.println(languages); //NullPointerException
//        languages.put(6, null);
//        System.out.println(languages);//NullPointerException

//        System.out.println("get() :" + languages.get(1));
//        System.out.println("remove() :" + languages.remove(1));
//        System.out.println(languages);

        //Entry specific method
//        for (Map.Entry entry : languages.entrySet()) // Read key & value
//        {
//            System.out.println(entry.getKey() + "  " + entry.getValue());
//        }

        //iterator()
        Set s = languages.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext())
        {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }
    }
}
