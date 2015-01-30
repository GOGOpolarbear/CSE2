//Yuchen Yang
//CSE 002 Lab02
//1/30/2015

//Cyclometer
//know how to store variables and use them to calculate and print them
//define the class
public class Cyclometer {
    //add main method
    public static void main (String [] agrs){
        int secsTrip1=480;  //time for trip1 in secs
        int secsTrip2=3220; //time for trip2 in secs
        int countsTrip1=1561; //counts for cycles of trip1
        int countsTrip2=9037; //counts for cycles of trip2
        double wheelDiameter=27.0, //diameter in inches
  	           PI=3.14159, //int the PI parameter
  	           feetPerMile=5280,  //use for convert 
  	           inchesPerFoot=12,   //use for convert
  	           secondsPerMinute=60;  //use for convert
	    double distanceTrip1, distanceTrip2,totalDistance;  // define the double variables

        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
        " minutes and had "+countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
	    " minutes and had "+countsTrip2+" counts.");
	    //print out the time for the trips
	    distanceTrip1=countsTrip1*wheelDiameter*PI; //distance in inches
	    distanceTrip2=countsTrip2*wheelDiameter*PI; //distance in inches
    	// diameter times PI get the distance for each count
    	distanceTrip1=distanceTrip1/inchesPerFoot/feetPerMile; // Converts distance into miles
	    distanceTrip2=distanceTrip2/inchesPerFoot/feetPerMile; 
	    totalDistance=distanceTrip1+distanceTrip2; // add up two distance for total
	    System.out.println("Trip 1 was "+distanceTrip1+" miles.");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles.");
	    System.out.println("The total distance was "+totalDistance+" miles.");
        //print out the distance of the trips
    }
}