package session22;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetSample {
    public static void main(String[] args) {

        // create LinkedHashSet
        //LinkedHashSet <Integer> lhs = new LinkedHashSet<>(); // Homogenous data
        LinkedHashSet lhs1 = new LinkedHashSet(); // any data-types (Homogenous+Heterogeneous)
        lhs1.add(1);
        lhs1.add(2);
        lhs1.add(3);
        lhs1.add(4);
        lhs1.add(5);

        System.out.println(lhs1);
        lhs1.add(6);
        System.out.println(lhs1);



    }
}
