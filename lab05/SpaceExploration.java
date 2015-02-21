//Yuchen Yang
//CSE 002 lab05
//SpaceExploration
//random
//Switch

import java.util.Random;

public class SpaceExploration{
    public static void main(String [] agrs){
        Random rand=new Random();
        int year=rand.nextInt(10)+2000;
        // or use math.random
        //int year =(int)(Math.random()*11) + 2000;
        System.out.printf("Here is a timeline of space exploration events from %d to 2000:\n",year);
        switch(year){
            case 2010:
                System.out.print("2010: ");
                System.out.println("SpaceX sucessfully sends spacecraft to orbit and back.");
            case 2009:
                System.out.print("2009: ");
                System.out.println("N/A");
            case 2008:
                System.out.print("2008: ");
                System.out.println("Kepler launched to study deep space.");
            case 2007:
                System.out.print("2007: ");
                System.out.println("N/A");
            case 2006:
                System.out.print("2006: ");
                System.out.println("Spacecraft returns with collections from a comet.");
            case 2005:
                System.out.print("2005: ");
                System.out.println("Spacecraft collies with comet.");
            case 2004:
                System.out.print("2004: ");
                System.out.println("N/A");
            case 2003:
                System.out.print("2003: ");
                System.out.println("Largest infrared telescope released.");
            case 2002:
                System.out.print("2002: ");
                System.out.println("N/A");
            case 2001:
                System.out.print("2001: ");
                System.out.println("First spacecraft lands on asteroid");
            case 2000:
                System.out.print("2000: ");
                System.out.println("First spacecraft orbits an asteroid");
                break;
            
        }
    }
}