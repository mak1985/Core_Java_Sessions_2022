package session22;

import java.util.HashMap;

public class HashMapCode {

    public static void main(String[] args) {

        HashMap <Integer, String> empData = new HashMap<>();
        empData.put(101, "John");
        empData.put(102, "Sam");
        empData.put(103, "Sam");
//        empData.put(103, "Tom");
//        empData.put(103, "Makhan");
        System.out.println(empData);//{101=John, 102=Paul, 103=Sam} {101=John, 102=Paul, 103=Tom}

//        System.out.println(empData.get(4));
        System.out.println(empData.get(101));
    }
}
