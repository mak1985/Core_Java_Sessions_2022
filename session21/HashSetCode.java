package session21;

import java.util.HashSet;

public class HashSetCode {

    public static void main(String[] args) {

        HashSet <Integer> set1 = new HashSet<Integer>();
        set1.add(10);
        set1.add(20);
        set1.add(60);
        set1.add(40);

        HashSet <Integer> set2 = new HashSet<Integer>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);

        //Union of two sets 1 & 2
//        set2.addAll(set1);
//        System.out.println("Union is : " + set2); //40,60,

        // retainAll() -  insertion - common elements from both the collection
//        set2.retainAll(set1);
//        System.out.println(set2); //10; 20; 40

        //diff of set 1 and set 2
        set1.removeAll(set2);
        System.out.println("Diff" + set1);
    }
}
