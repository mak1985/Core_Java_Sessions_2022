package session6;

public class SingleDimensionalArrayCode {

    public static void main(String[] args) {
//        //Declare & initialize array
//        //syntax : datatype [] varName;
//        //datatype varName [];
//
//        //Initialization
//        int [] salaryEmp = new int[6];
//
//        //insert value in an array
//        salaryEmp[0] = 50000;
//        salaryEmp[1] = 60000;
//        salaryEmp[2] = 70000;
//        salaryEmp[3] = 80000;
//        salaryEmp[4] = 90000;
//
//        //print size of an array
////        System.out.println("Size of an array : " +salaryEmp.length);
//
//        //read values from an array
//        System.out.println("Value of 4th emp salary:" +salaryEmp[4]); //Value of 4th emp salary:90000
//
//        //Read all the values of an array using for loop
////        for (int i=0; i<salaryEmp.length; i++)
////        {
////            System.out.println("Using for loop : " + salaryEmp[i]);
////        }
////
//        // for each loop (enhanced loop) -  speacialy for array
//
//        for (int i:salaryEmp)
//        {
//            System.out.println("For each loop: " + i);
//        }

        int [] salaryEmp = {50000,60000,70000,80000,90000,10000,12, 155,155,}; //till 4th index position
        //print size of an array
        System.out.println("Size of an array :" + salaryEmp.length); //the values position

        //read value from an array
        System.out.println("Value of 3th element" + salaryEmp[2]); //70000
        System.out.println("Value of 1st element" + salaryEmp[0]); //50000

        for (int i:salaryEmp)
        {
            System.out.println("For each loop: " + i);
        }
    }
}
