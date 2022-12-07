package session14;

public abstract class AbstractClassSample {

    //constractor
    AbstractClassSample()
    {
        System.out.println("AbstractClassSample created");

    }
    //create Abstract method - no body implementation
    abstract void run();


    //create non-Abstract method
    void start()
    {
        System.out.println("I am running");
    }

    //create static method
    static void stop()
    {
        System.out.println("I am stopped");
    }

    public static void main(String[] args) {

    }
}
