package session16;

public class Hacking {

    public static void main(String[] args) {

        EncapsulationSample obj = new EncapsulationSample();

        System.out.println(obj.getAdharNumber()); //read only
        System.out.println(obj.getVoterName());
        System.out.println(obj.getAge());


    }
}
