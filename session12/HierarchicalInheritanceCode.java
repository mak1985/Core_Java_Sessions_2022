package session12;

class Parent
{
    int a;

    void displayParent()
    {
        System.out.println("Parent class " + a);
    }
}

class Son1 extends Parent
{
    int b;

    void displayChild1()
    {
        System.out.println("Parent class " + b);
    }

}

class Son2 extends Parent
{
    int c;

    void displayChild2()
    {
        System.out.println("Parent class " + c);
    }
}

public class HierarchicalInheritanceCode {

    public static void main(String[] args) {

        Son2 obj1 = new Son2();
        obj1.c = 100; //son2
        obj1.a = 200; //parent

        obj1.displayChild2();
        obj1.displayParent();

        Son1 obj2 = new Son1();
        obj2.a= 300;//parent
        obj2.b =400;//son1

        obj2.displayChild1();
        obj2.displayParent();

    }
}
