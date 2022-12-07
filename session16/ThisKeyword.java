package session16;

public class ThisKeyword {

    //instance variable
    private int x = 100;

    public ThisKeyword(int x) // local "x" variable
    {

    }

    public void show()
    {
        int x = 21; //local variable
        System.out.println(this.x);
        System.out.println(x);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(10);
        obj.show();

    }
}
