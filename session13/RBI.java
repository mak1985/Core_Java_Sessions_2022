package session13;
//Parent class
public class RBI
{
    public static void main(String[] args) {
        HDFC objHdfc = new HDFC();
        System.out.println("HDFC ROI :" + objHdfc.getRateOfInterest()); //5.0;

        ICICI objIcici = new ICICI();
        System.out.println("ICICI ROI : " +objIcici.getRateOfInterest());//6.9

        SBI objSbi = new SBI();
        System.out.println("SBI ROI : " + objSbi.getRateOfInterest());//6.1

    }

      double getRateOfInterest()
    {
        return 0.0;
    }
}
//Child class or sub-class
class HDFC extends RBI
{
    double getRateOfInterest()
    {
        return 6.0;
    }
}
//Child class or sub-class
class ICICI extends RBI
{
    double getRateOfInterest()
    {
        return 6.9;
    }

}
//Child class or sub-class
class SBI extends RBI
{
    double getRateOfInterest()
    {
        return 6.1;
    }

}
