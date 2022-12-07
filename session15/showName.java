package session15;

 interface showName
{
    void showName(String name); // methods are abstarct by default and public

}
//An Interface can extents multiple Interfaces
interface showAge extends showName
{

    int age=10;
    void showAge(int age);

}
//----> A class implements an interface
class InterfaceDemo implements showAge,showName  {

    @Override
    public void showName(String name) {
        System.out.println("name is "+name);
    }

    @Override
    public void showAge(int age) {
        System.out.println("name is "+age);
    }

    public static void main(String[] args) {

        InterfaceDemo obj = new InterfaceDemo();
        obj.showName("Raghu");
        obj.showAge(40);

    }
}

