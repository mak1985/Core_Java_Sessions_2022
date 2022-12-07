package session9;

class ConstructorNoParameter {

    String car; // instance variables as declared but not initialized
    int year;// instance variables as declared but not initialized

    //constructor with parameters
    ConstructorNoParameter(String carName, int yearBuilt)
    {
        //initialize the value
        car=carName;
        year=yearBuilt;

    }

    public static void main(String[] args) {

        ConstructorNoParameter obj = new ConstructorNoParameter("Honda", 2020);
        System.out.println(obj.car + "    " + obj.year);
    }
}
