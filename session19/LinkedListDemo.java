package session19;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        /**
         * Common Methods in LinkedList
         * 1. add (obj)
         * 2. add (index, obj)
         * 3. addAll(Collection)
         * 4. remove(obj)
         * 5. remove(index, obj)
         * 6. removeAll(collection)
         * 7. get(index)
         * 8. set(index, obj)
         *
         * Special methods for LinkedList
         * 1.addFirst() --------at the begening of index
         * 2. addLast(0 --------end of the list
         * 3. removeFirst()
         * 4. removeLast()
         * 5. getFirst()
         * 6. getLast()
         * 7. push(0
         * 8. peek()
         * 9. pop()
         * 10.peekFirst()
         * 11. peekLast()
         *
         */

        //Declare LinkedList
        LinkedList <String> list = new LinkedList<>();
        list.add("John");
        list.add("Paul");
        list.add("Smith");
        list.add("Smith");
        System.out.println("CHecking +++++++++++++++++++++++++++++++++++++++++++++"+list);
        list.add(1, "Peter");
        System.out.println("After adding Peter" +list);

        //Coll 2
        LinkedList <String> list2 = new LinkedList<>();
        list2.add("Tom");
        list2.add("Dick");
        list2.add("Harry");

        //add collection list2 to the end of collection list
        list.addAll(list2);
        System.out.println("After adding coll 2 in coll1"+ list);

        //remove()
        list.remove("Tom");
        System.out.println("Remove ele"+ list);

        //removeAll()
        list.removeAll(list2);
        System.out.println("After removing entire coll 2 from coll 1" + list);

        //get element of position 1st
        System.out.println(list.get(1));//Peter

        //set() - replace the exiting one with the new value
        list.set(1, "Smith");
        System.out.println(list);//Smith

        //clear()
//        list.clear();
//        System.out.println("clear method"+ list);
        //contains method () -
        System.out.println(list.contains("Rakesh"));//true

        // Additional methods in LinkedList for stack and queue operations

    }
}
