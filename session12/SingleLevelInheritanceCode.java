package session12;

class A //parent class
{
    int a;

    void display()
    {
        System.out.println("Class A : " + a);
    }
}

class B extends A //child class will extend parent class
{
    int b;

    void print()
    {
        System.out.println("Class B: + b");
    }

}
class SingleLevelInheritanceCode
{
    /**
     * 1. Single Level Inheritance
     */
    public static void main(String[] args) {

        A parent = new A();
        parent.a=20;
        parent.display();

        B child = new B();
        child.a = 30; // class A
        child.b = 25; // class B

        child.display(); // class A
        child.print(); // class B
    }

}
