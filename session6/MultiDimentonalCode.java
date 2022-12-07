package session6;

public class MultiDimentonalCode {
    public static void main(String[] args) {
        //declaration & Initialization
        /*
        syntax: dataType [][] varName = new dataType[3][3]; //1st - row & 2nd column

         */

        int [][] empData = new int [3][2]; // 3 rows & 2 columns

        int [][] empData1 = {{12,13}, {14,15}, {16,17}, {16,17}};

        //insert values in an array
        empData[0][0] = 12;
        empData[0][1] = 13;

        empData[1][0] = 14;
        empData[1][1] = 15;

        empData[2][0] = 16;
        empData[2][1] = 14;

//        System.out.println("Print no of rows: "+ empData.length); //Print no of rows: 3
//        System.out.println("Print no of columns " + empData[0].length);//Print no of columns 2

        System.out.println("Print no of rows: "+ empData1.length); //get the no.of rows
        System.out.println("Print no of columns " + empData1[0].length);
    }
}
