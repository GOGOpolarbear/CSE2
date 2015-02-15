//Yuchen Yang
//2/13/2015
//Cookies

import java.util.Scanner;

public class Cookies{
    public static void main(String [] agrs){
        //define method
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        //int the variables first
        int nPeople,nCookies,nEachExpect;
        //get the data from user input
        //number of People
        System.out.print("Enter the number of People: ");
        if (myScanner.hasNextInt()){
            nPeople=myScanner.nextInt();
            if (nPeople<0){
                System.out.println("You did not enter an int > 0");
                return; //program ended

            }
        }
        else{
            System.out.println("You did not enter an int.");
            return; // program ended
        }
        
        //number of cookies
        System.out.print("Enter the number of cookies you are planning to buy: ");
        if (myScanner.hasNextInt()){
            nCookies=myScanner.nextInt();
             if (nCookies<0){
                System.out.println("You did not enter an int > 0");
                return; //program ended

            }
        }
        else{
            System.out.println("You did not enter an int.");
            return; // program ended
        }
        
        //how many for each person
        System.out.print("How many cookies do you want each person to have: ");
        if (myScanner.hasNextInt()){
            nEachExpect=myScanner.nextInt();
             if (nEachExpect<0){
                System.out.println("You did not enter an int > 0");
                return; //program ended

            }
        }
        else{
            System.out.println("You did not enter an int.");
            return; // program ended
        }
        
        //calculation
        if (nCookies>=nPeople*nEachExpect){
            System.out.print("You have enough cookies for each person ");
            if(nCookies%nPeople!=0){
                System.out.println("but the amount cannot divide evenly.");
            }
            else{
                System.out.println("and the amount will divide evenly.");
            }
        }
        else{
            int nExtra=nPeople*nEachExpect-nCookies;
            System.out.print("You don't have enough cookies. ");
            System.out.println("You need to buy at least "
            +nExtra+" more.");
        }     //end of the most outer if
        
    }
}