//Yuchen Yang
//2/5/2015
//CSE 002 lab03

//Scanner, use scanner to input variables
import java.util.Scanner;//import Scanner to compiler

public class BigMac {
    //define main method
    public static void main(String [] args){
       
        //define the Scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.print("Enter the number of Big Macs(an integer>0):");
        // Scan int variables
        int nBigMacs=myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as"+
         " a double (in the form xx.xx): " );
        // Scan double variables
        double bigMac$=myScanner.nextDouble();
	    System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate=myScanner.nextDouble();
        taxRate/=100; //transfer the number input into real tax ratio
        double cost$; //define the total cost
        int dollars,   //whole dollar amount of cost 
            dimes, pennies; //for storing digits
              //to the right of the decimal point 
              //for the cost$ 
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        // get dimes amount, 
        // for example, (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  the % (mod) operator returns the remainder
        dimes=(int)(cost$*10)%10;
        // get pennies amount
        pennies=(int)(cost$*100)%10;
        //output the result
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"
        +bigMac$ +" per bigMac, with a" +  " sales tax of "+ (int)(taxRate*100) 
        + "%, is$"+dollars+'.'+dimes+pennies);
        
        
    }
}
