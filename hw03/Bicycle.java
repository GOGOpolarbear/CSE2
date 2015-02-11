//Yuchen Yang
//CSE 002 hw03
//Bicycle
//2/10/2015

//import scanner
import java.util.Scanner;
//define class
public class Bicycle {
    //define main method
    public static void main(String [] agrs){
        //define scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        //get variables of counts from user input
        System.out.print("Enter number of counts on the cyclometer(an integer>0): ");
        int nCounts=myScanner.nextInt();
        //get variables of seconds from user input
        System.out.print("Enter number of seconds during the counts(an integer>0): ");
        int nSeconds=myScanner.nextInt();
        //define the settled data, and convertion constant
        //almost the same as lab02 for this part
        double wheelDiameter=27.0, //diameter in inches
  	           PI=3.14159, //int the PI parameter
  	           feetPerMile=5280,  //use for convert 
  	           inchesPerFoot=12,   //use for convert
  	           secondsPerMinute=60,  //use for convert
  	           minutePerHour=60; //use for convert
        //define the variables that we are looking for
        double distance,nHours,nMinutes,avgMilesPerHours;
        //counts*perimeter/convertion
        distance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //convert seconds into minutes and hours
        nMinutes=nSeconds/secondsPerMinute;
        nHours=nMinutes/minutePerHour;
        //get mph
        avgMilesPerHours=distance/nHours;
        
        //output results
        //use string format to output only two decimal place
        //somehow string format will perform a better result
        //in the sample run it is 2.08, but the real result is 2.0897..
        //so 2.09 is better result
        System.out.println("The distance was "+String.format("%.2f",distance)+
        "miles and took "+nMinutes+"miles.");
        System.out.println("The average mph was "+String.format("%.2f", avgMilesPerHours));
        
        
        
    }
}