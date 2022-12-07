package session18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList(); //Homogeneous + Hetrogenous data - ANy data types

        //ArrayList <String> al1 = new ArrayList<String>();//Homogeneous data types

        // Methods in ArraysList
        /*
            1. add(object)
            2. add(index, obj)
            3. get(index)
            4. set(index, object) ------> change the value of element
            5. size()
            6. clear() ------clear all index values
            7. remove(index) ----Remove any specific index value
            8. contains(object) -------Return boolean true or false
            9. isEmpty() -----Return boolean true or false
            10. addAll(Collection) ------
            11. removeAll(Collection) ---------

         */
        // 1. add(object) - Method
        al.add("Java");
        al.add(100);
        al.add('M');
        al.add(true);
        al.add(12.01);
        //print arrayList
        System.out.println(al);
        //5. size method - counts of values
        System.out.println(al.size());
        //7. remove(index) ----Remove any specific index value
        al.remove(1);
        System.out.println(al);
        //3. get(index)
        System.out.println(al.get(3));//12.01
        //set(index, object) ------> change the value of element
        System.out.println(al.set(0,"TypeScript"));
        System.out.println(al);
        //2. add(index, obj) - insert
        al.add(1, "1000");
        System.out.println(al);
        //al.clear();

        //9. isEmpty() -----Return boolean true or false
        System.out.println(al.isEmpty());
        System.out.println(al);
        //8. contains(object) -------Return boolean true or false
        //al.contains("TypeScript");//true
        System.out.println(al.contains("TypeScript"));

    }
}
