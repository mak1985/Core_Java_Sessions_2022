package session10;

public class Counter {

    //class variables
    static int count = 1; //non-static variable, will get memory allocation everytime object of the class is created

//    static int count1 =0;

    Counter()   //constructor with parameter
    {
        count++; //increase by 1
        System.out.println(count);
    }

    public static void main(String[] args) {

//        Counter obj1 = new Counter();
//        Counter obj2 = new Counter();
//        Counter obj3 = new Counter();
//        System.out.println(obj1.count);
//        System.out.println(obj2.count);
//        System.out.println(obj3.count);
        System.out.println("yyyyy");
    }
}
