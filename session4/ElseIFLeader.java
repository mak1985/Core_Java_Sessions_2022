package session4;

public class ElseIFLeader {

    public static void main(String[] args) {
        int votingRight =19;

        if(votingRight ==17 ) // 1st condtion
        {
            System.out.println("No Voting rights");
        }
        else if (votingRight==18) //2nd condition
        {
            System.out.println("Voting rights");
        }
        else if (votingRight==19) //3rd condition
        {
            System.out.println("Already Voting rights");
        }
        else ////In case of all above condtions not meet then execute else condition
        {
            System.out.println("Kids are not allowed for vote");
        }



    }
}
