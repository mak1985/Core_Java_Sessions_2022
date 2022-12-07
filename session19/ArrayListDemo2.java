package session19;

import java.util.*;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        List arrList = new ArrayList<>(); // Declared array list
        arrList.add("S");
        arrList.add("A");
        arrList.add("M");

        System.out.println(arrList);
        //addAll method - To add collection to different collection

        ArrayList <String> arrayList2 = new ArrayList<>(); // Homogeneous
        arrayList2.add("Tom");
        arrayList2.addAll(arrList);
        System.out.println("After adding collection:" + arrayList2);

        //remove method - Remove collection elements
        arrayList2.removeAll(arrList);
        System.out.println("After removing arrList object" + arrayList2);

        // How to use loop through elements of arraylist
        /**
         * 1. for loop
         * 2. for each loop
         * 3. iterator
         */
        //1. for loop
//        for (int i = 0; i < arrayList2.size(); i++)
//        {
//            System.out.println(arrayList2.get(i));
//        }
//
//        //2. for each loop
//        for (Object i : arrList)
//        {
//            System.out.println(i);
//        }

        //3. iterator
//        Iterator it = arrList.iterator();
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        // How to sort arrayList using Collections class
//        System.out.println("Before sorting : " + arrList);
//        Collections.sort(arrList);
//        System.out.println("After sorting : " + arrList);

        // Sorting arrayList in reverse oder
//        Collections.sort(arrList, Collections.reverseOrder());
//        System.out.println("After reverse oder sorting" + arrList);

        //shuffle arraylist
//        Collections.shuffle(arrList);
//        System.out.println("After shuffling " + arrList);

        // How to create arrayList from array
        //creating String array
        String bikes[] = {"Pulser", "Honda", "Bajaj"};

        ArrayList obj = new ArrayList(Arrays.asList(bikes));
        System.out.println(obj);

    }
}
