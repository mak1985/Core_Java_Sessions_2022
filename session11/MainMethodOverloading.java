package session11;

public class MainMethodOverloading {

    void main(int x)
    {
        System.out.println(x);
    }

    void main(double x)
    {
        System.out.println(x);
    }

    void main(int x, int y)
    {
        System.out.println((x+y));
    }

    public static void main(String[] args) {
        MainMethodOverloading obj = new MainMethodOverloading();
        obj.main(10);
        obj.main(10.0);
        obj.main(10, 20);
    }
}
