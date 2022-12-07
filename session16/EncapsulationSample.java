package session16;

public class EncapsulationSample {

    private int adharNumber = 1234;
    private String voterName = "John";
    private int age = 42;

    public int getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(int adharNumber) {
        this.adharNumber = adharNumber;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        /*
        How to implement Encapsulation (Data hinding)
        1. private data members - variables so that these variables cannot access directly from outside of the class
         */

        EncapsulationSample obj = new EncapsulationSample();
        System.out.println(obj.adharNumber);
        System.out.println(obj.voterName);
        System.out.println(obj.age);

        /*
            2. getter and setter methods to set and get the values of the fields(private variables)
         */


    }
}
