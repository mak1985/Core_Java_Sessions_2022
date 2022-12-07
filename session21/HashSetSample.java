package session21;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

    public static void main(String[] args) {

        /**
         * Syntax: HashSet <ANy Data type> numbers = new HashSet<> ();
         *
         */

        // Insert elements to hashset
        //add() - insert the specific ele to the set
        //addAll() - insert all the ele of the specific collection to the set
        //remove() - specific ele
        //removeAll()-specific collection
        //contains() - search the ele and its returns boolean value
        //isEmpty() - checks if the Hashset is empty
        //size() -
        //clear()-

        //Declare HashSet
        //HashSet <Integer> hs = new HashSet();
        HashSet  hs = new HashSet();

        //insert ele
        hs.add("Honda");
        hs.add("BMW");
        hs.add("Maruti");
        //System.out.println(hs);

        //addAll() -insert all the ele of the specific collection to the set
        HashSet <String> cars = new HashSet<String>();
        cars.add("Hundai");
        cars.add("Toyato");
        //hs.addAll(cars);
        //System.out.println(hs);

//        // remove() - specific ele
//        hs.remove("BMW");
//        System.out.println(hs);
//
        // removeAll() -specific collection
        //System.out.println(hs.removeAll(cars));
        //System.out.println(cars);
//
//        //contains() - search the ele and its returns boolean value
//        System.out.println(hs.contains("Maruti")); // true
//
//        //containsAll() - search the collection and its returns boolean value
//        System.out.println(hs.containsAll(cars)); // false

        //isEmpty()
//        System.out.println(cars.removeAll(hs));
//        System.out.println(hs.isEmpty());//false
//
//        //size()
//        System.out.println();

        //Read ele of hastset using for each loop
//        for (Object e : hs)
//        {
//            System.out.println(e);
//        }

        //Iterator
//        Iterator it = cars.iterator();
//            while(it.hasNext())
//            {
//                System.out.println(it.next());
//            }


        cars.retainAll(hs);
        System.out.println(cars);
    }
}
