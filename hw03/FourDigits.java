//Yuchen Yang
//CSE 002 hw03
//Four digits
//2/10/2015

//import Scanner
import java.util.Scanner;

//define class and main method
public class FourDigits{
    public static void main(String [] agrs){
        //define Scanner
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        //output hint for input
        //the sentence is long but the content within "" cant be seperate
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
        double number=myScanner.nextDouble();
        int firstD, secondD, thirdD, fourthD;
        firstD=(int)(number*10)%10;
        secondD=(int)(number*100)%10;
        thirdD=(int)(number*1000)%10;
        fourthD=(int)(number*10000)%10;
        //use seperate four digits to form a new int
        double fourDigits=firstD*1000+secondD*100+thirdD*10+fourthD;
        //output the result
        System.out.println("The four digits are: "+fourDigits);
        //cant solve the 0 problem
        
    }
}