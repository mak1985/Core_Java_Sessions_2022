package session11;

public class ConstructorOverloading {

    ConstructorOverloading(int x)
    {
        System.out.println(x);
    }

    ConstructorOverloading(int x, int y)
    {
        System.out.println(x-y);
    }

    ConstructorOverloading(double x, double y, int z)
    {
        System.out.println(x+y+z);
    }

    public static void main(String[] args) {

        ConstructorOverloading obj = new ConstructorOverloading(10);
        ConstructorOverloading obj1 = new ConstructorOverloading(10, 20);
        ConstructorOverloading obj2 = new ConstructorOverloading(10.0, 10.0, 20);
    }
}
