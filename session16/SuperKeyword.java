package session16;

class Animal //Parent
{
    String color = "White";
}

class Dog extends Animal //Dog class as child
{
    String color = "Black";

    void printColor()
    {
        System.out.println(color); // print color of Dog class
        System.out.println(super.color); // print color of Animal class
    }

}


public class SuperKeyword {

    public static void main(String[] args) {

        Dog obj =  new Dog();
        obj.printColor();
    }
}
