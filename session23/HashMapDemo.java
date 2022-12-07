package session23;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        /**
         * 1. Use for search operation
         * 2. Underlaying data structure is Hashtable
         * 3. Duplicate keys are not allowed (Unique)
         * 4. Duplicate values are allowed
         * 5. Null key allowed only once
         * 6. Null values allowed multiple times
         * 7. HashMap initial capacity  8 & load factor 0.6
         */

        //HashMap hm = new HashMap();
        HashMap <Integer, String> hm = new HashMap<>();
        //adding elements in key & value pair
        hm.put(101, "Smith");
        hm.put(102, "David");
        hm.put(103, "Tom");
//        System.out.println(hm);//{101=Tom, 102=Sam, 103=Mak}
////        hm.put(101, "Smith");
////        System.out.println(hm);//{101=Smith, 102=Sam, 103=Mak}
//        hm.put(null, "Test");
//        System.out.println("After adding null key :" + hm);//After adding null key :{null=Test, 101=Tom, 102=Tom, 103=Tom}
//        hm.put(null, "Test1");
//        System.out.println("After adding null key 2nd time :" + hm);
//        hm.put(104, null);
//        hm.put(105, null);
//        System.out.println("After adding multiple null values" + hm);

        //fetch element
//        System.out.println(hm.get(101));//Smith
//        //remove element
//        System.out.println(hm.remove(101));//Smith
//        System.out.println(hm);//102:David; 103:Tom
//
//        //containsKey(Key) - returning boolean value (true or false)
//        System.out.println(hm.containsKey(101));
//        //containsValue() - returning boolean value (true or false)
//        System.out.println(hm.containsValue("Tom")); //false
//
//        //isEmpty() - returning boolean value (true or false)
//        System.out.println(hm.isEmpty()); //false

        //keySet() - Return all the keys from HashMap as set
//        System.out.println(hm.keySet());//[101, 102, 103]

        //values() - Return all the values from HashMap as Collection
        //System.out.println(hm.values()); //[Smith, David, Tom]

        //entrySet() - Return all the entries as Set
        //System.out.println(hm.entrySet()); //[101=Smith, 102=David, 103=Tom]

//        for (Object i: hm.keySet())
//        {
//            System.out.println(i);
//        }

//        for (Object i : hm.values())
//        {
//            System.out.println(i);
//        }

        // Return key & value pair using for each loop
        for (Object i: hm.keySet())
        {
            System.out.println(i + " " + hm.get(i));
        }
    }
}
