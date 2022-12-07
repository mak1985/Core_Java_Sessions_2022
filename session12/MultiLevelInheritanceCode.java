package session12;

class GrandFather
{
    int a;

    void display()
    {
        System.out.println("Class GrandFather :" + a);
    }
}

class Father extends GrandFather
{
    int b;

    void print()
    {
        System.out.println("Class Father :" + b);
    }
}

class Son extends Father
{
    int c;

    void show()
    {
        System.out.println("Class Son :" + c);
    }
}

public class MultiLevelInheritanceCode
{

    public static void main(String[] args) {

        Son sonObj = new Son();
        sonObj.a = 100; //Class GrandFather
        sonObj.b = 200; //Class Father
        sonObj.c = 300;//Class Son

        sonObj.display(); //Class GrandFather
        sonObj.print(); //Class Father
        sonObj.show(); //Class Son
    }
}
