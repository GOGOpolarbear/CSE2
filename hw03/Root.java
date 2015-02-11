//Yuchen Yang
//CSE 002 hw03
//Root
//2/10/2015

//import Scanner
import java.util.Scanner;
//define class and main method
public class Root{
    public static void main (String [] agrs){
        //define scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        //output the hint asking for input
        System.out.print("Enter a double and I will fine its cube root: ");
        double x=myScanner.nextDouble();
        //define the first guess as x/3
        double guess=x/3;
        //improve my estimate 5 times in total
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        guess=(2*guess*guess*guess+x)/(3*guess*guess);
        //the cubed value of my final guess
        double cubedGuessValue=guess*guess*guess;
        //output the result
        System.out.println("The cube root is: "+guess);
        System.out.println(guess+"*"+guess+"*"+guess+"="+cubedGuessValue);
        //after a few attempts, it shows that
        //this method need a lot of repeatation to produce accurate result
        //e.g. the result of 125 is 6.3
        //so a if or while circulation will be perfect for this method
        
        
    }
}

