package session20;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample1 {
    public static void main(String[] args) {

        // Additional methods in LinkedList for stack and queue operations
        //create linkedlist for string
        LinkedList cars = new LinkedList(); // hom
        //LinkedList <String> cars = new LinkedList<>();
        // add elements to LinkedList
//        cars.add("Maruti");
//        cars.add("Honda");
//        cars.add("BMW");
//        cars.add(1);

//        System.out.println("Before addFirst() method"    +cars);
        // AddFirst()
//        cars.addFirst("Jeep");
//        System.out.println("After addFirst() method" + cars); // Jeep, Maruti, Honda, BMW
//        //addLast
//        cars.addLast("Jeep");
//        System.out.println("After addLast() method" + cars);//Maruti, Honda, BMW, Jeep
//
//        // removeFirst()
//        System.out.println(cars.removeFirst());
//        System.out.println(cars);
//
//        //removeLast()
//        System.out.println(cars.removeLast());
//        System.out.println(cars);//Honda, BMW, 1
//
//        //getFirst() and getLast()
//        System.out.println("getFirst()" + cars.getFirst());//Honda
//        System.out.println("getLast()" + cars.getLast());//1

        // push method - stack  operations
        cars.add("tVS");
        cars.add("bajaj");
        cars.add("honda");
        cars.add("123555555");

        System.out.println(cars);//[TVS, Bajaj, Honda]
        //push()
        cars.push("damage car");
//        System.out.println("After adding push()"+ cars);

        //pop method - remove and return the first element
//        System.out.println("pop method()" + cars.pop());
//        System.out.println(cars);

        //peek() - Retrive the first element but not remove
//        System.out.println("Retrive the first element but not remove   :" + cars.peek());//Damage car
//        System.out.println(cars); //[Damage car, TVS, Bajaj, Honda]
//
//        //peekFirst()
//        System.out.println("peekFirst() : " + cars.peekFirst());
//        System.out.println(cars); //[Damage car, TVS, Bajaj, Honda]
//
//        //peekLast()
//        System.out.println("peekLast(): "  + cars.peekLast());

        // Read elements from linkedlist using for loop, for each loop and Iterator
//        for (int i = 0;  i <cars.size(); i++)
//        {
//            System.out.println(cars.get(i));
//        }

//        for (Object e : cars)
//        {
//            System.out.println(e);
//        }
//
//        Iterator it = cars.iterator();
//            while (it.hasNext())
//            {
//                System.out.println(it.next());
//            }

        // Methods from Collections class
        // sort linkedList
        Collections.sort(cars);
        System.out.println(cars);//[123555555, bajaj, damage car, honda, tVS]

        // sorting in reverse order
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);//[tVS, honda, damage car, bajaj, 123555555]

        // shuffling - random ordering
        Collections.shuffle(cars);
        System.out.println("shuffling - random ordering " + cars);

    }
}
