//Yuchen Yang
//CSE 002 hw04
//Banking

//import Random and Scanner
import java.util.Random;
import java.util.Scanner;

public class Banking{
    public static void main(String [] agrs){
        //define myScanner
        Scanner myScanner=new Scanner(System.in);
        //define rand
        Random rand=new Random();
        //get random account amount from 1000 to 5000 inclusive
        int account=rand.nextInt(4000)+1000;
        //ask user what they want to do with their account
        //making them input number for different command
        System.out.print("If you want to deposit,           Enter 1\n"+
                         "If you want to withdraw money,    Enter 2\n"+
                         "If you want to view your balance, Enter 3: ");
        //define choice for switch statments
        int choice=myScanner.nextInt();
        //start switch 
        switch(choice){
            case 1://deposit
                System.out.print("How much do you want to deposit? (Enter positive int):");
                int deposit=myScanner.nextInt();
                if(deposit>0){
                    System.out.println("Your balance before deposit is $"+account);
                    account=account+deposit;
                    System.out.println("Your balance after deposit is $"+account);
                }
                else{
                    System.out.println("You need to input positive integer!");
                }
                //end of deposit part
                break;
            case 2://withdraw
                System.out.print("How much do you want to withdraw? (Enter positive int):");
                int withdraw=myScanner.nextInt();
                if(withdraw>account){
                    System.out.println("Your account don't have enough money.");
                    System.out.println("You only have $"+account);
                }
                else if(withdraw>0){
                    System.out.println("Your balance before withdraw is $"+account);
                    account=account-withdraw;
                    System.out.println("Your balance after withdraw is $"+account);
                }
                else{
                    System.out.println("You need to input positive integer!");
                }
                //end of withdraw
                break;
            case 3://view balance
                System.out.println("Your account balance now is $"+account);
                break;
                //end of viewing balance
            default://invalid input out of 1,2,3
                System.out.println("You have invalid input, should be 1 or 2 or 3.");
                break;
        }
        //end of switch
    }
}