//Yuchen Yang
//CSE 002 Hw04
//Which number

//import Scanner into the compiler
import java.util.Scanner;

public class WhichNumber{
        
    public static void main(String [] agrs){
        //define the scanner
        Scanner myScanner=new Scanner(System.in);
        //make user decide a number
        System.out.println("Think of a number between 1 and 10 inclusive.");
        
        //define string for y/Y/n/N
        String yes1="Y";
        String yes2="y";
        String no1 ="N";
        String no2 ="n";
        //begin guessing
        //even or not
        System.out.print("Is your number even? (input Y/N or y/n): ");
        String evenOrNot=myScanner.next();//get the string of even or not
        //start the if
        if (yes1.equals(evenOrNot)||yes2.equals(evenOrNot)){// Y or y
            System.out.print("Is it divisible by 3? (input Y/N or y/n): ");
            String divideBy3=myScanner.next();//divisible by 3 or not
            
            if (yes1.equals(divideBy3)||yes2.equals(divideBy3)){
                //6
                System.out.print("Is your number 6? (input Y/N or y/n): ");
                //end of guessing
                //final judge
                String finalJudge=myScanner.next();
                if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                    System.out.println("I am so good at it!");
                }
                else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                    System.out.println("You are lying!");
                }
                else{
                System.out.println("You didn't answer my question.");
                }
                //end of final judge
            }
            else if (no1.equals(divideBy3)||no2.equals(divideBy3)){
                System.out.print("Is the number divisible by 4? (input Y/N or y/n): ");
                String divideBy4=myScanner.next();
                //decide whether divisible by 4
                if (yes1.equals(divideBy4)||yes2.equals(divideBy4)){
                    System.out.print("When divided by 4 is the result greater that 1? (input Y/N or y/n): ");
                    String factorLarger1=myScanner.next();
                    //8 or 4
                    if (yes1.equals(factorLarger1)||yes2.equals(factorLarger1)){
                        System.out.print("Is your number 8? (input Y/N or y/n): ");
                        //end of guessing
                        //final judge
                        String finalJudge=myScanner.next();
                        if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                            System.out.println("I am so good at it!");
                        }
                        else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                            System.out.println("You are lying!");
                        }
                        else{
                        System.out.println("You didn't answer my question.");
                        }
                        //end of final judge
                        }
                    else if(no1.equals(factorLarger1)||no2.equals(factorLarger1)){
                        System.out.print("Is your number 4? (input Y/N or y/n): ");
                        //end of guessing
                        //final judge
                        String finalJudge=myScanner.next();
                        if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                            System.out.println("I am so good at it!");
                        }
                        else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                            System.out.println("You are lying!");
                        }
                        else{
                        System.out.println("You didn't answer my question.");
                        }
                        //end of final judge
                    }
                    else{
                        System.out.println("Sorry, it is an invalid input.");
                    }
                }
                else if (no1.equals(divideBy4)||no2.equals(divideBy4)){
                    System.out.print("Is it divisible by 5? (input Y/N or y/n): ");
                    String divideBy5=myScanner.next();
                    //10 or 2
                    if (yes1.equals(divideBy5)||yes2.equals(divideBy5)){
                        System.out.print("Is your number 10? (input Y/N or y/n): ");
                        //end of guessing
                        //final judge
                        String finalJudge=myScanner.next();
                        if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                            System.out.println("I am so good at it!");
                        }
                        else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                            System.out.println("You are lying!");
                        }
                        else{
                        System.out.println("You didn't answer my question.");
                        }
                        //end of final judge
                    }
                    else if (no1.equals(divideBy5)||no2.equals(divideBy5)){
                        System.out.print("Is your number 2? (input Y/N or y/n): ");
                        //end of guessing
                        //final judge
                        String finalJudge=myScanner.next();
                        if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                            System.out.println("I am so good at it!");
                        }
                        else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                            System.out.println("You are lying!");
                        }
                        else{
                        System.out.println("You didn't answer my question.");
                        }
                        //end of final judge
                    }
                }
                else{
                     System.out.println("Sorry, it is an invalid input.");
                }  
            }
            else{
                System.out.println("Sorry, it is an invalid input.");
            }
            
        }
        else if (no1.equals(evenOrNot)||no2.equals(evenOrNot)){//N or n
            System.out.print("Is it divisible by 3? (input Y/N or y/n): ");
            String divideBy3=myScanner.next();//divisible by 3 or not
            
            if (yes1.equals(divideBy3)||yes2.equals(divideBy3)){
                System.out.print("When divided by 3 is the result greater that 1? (input Y/N or y/n): ");
                String factorLarger1=myScanner.next();
                //9 or 3    
                if (yes1.equals(factorLarger1)||yes2.equals(factorLarger1)){
                    System.out.print("Is your number 9? (input Y/N or y/n): ");
                    //end of guessing
                    //final judge
                    String finalJudge=myScanner.next();
                    if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                        System.out.println("I am so good at it!");
                    }
                    else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                        System.out.println("You are lying!");
                    }
                    else{
                    System.out.println("You didn't answer my question.");
                    }
                    //end of final judge
                    }
                else if (no1.equals(factorLarger1)||no2.equals(factorLarger1)){
                    System.out.print("Is your number 3? (input Y/N or y/n): ");
                    //end of guessing
                    //final judge
                    String finalJudge=myScanner.next();
                    if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                        System.out.println("I am so good at it!");
                    }
                    else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                        System.out.println("You are lying!");
                    }
                    else{
                    System.out.println("You didn't answer my question.");
                    }
                    //end of final judge
                    }
                    else{
                        System.out.println("Sorry, it is an invalid input.");
                    }
            }
            else if (no1.equals(divideBy3)||no2.equals(divideBy3)){
                System.out.print("Is it greater than 6? (input Y/N or y/n): ");
                String larger6=myScanner.next();
                if (yes1.equals(larger6)||yes2.equals(larger6)){
                    //7
                    System.out.print("Is your number 7? (input Y/N or y/n): ");
                    //end of guessing
                    //final judge
                    String finalJudge=myScanner.next();
                    if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                        System.out.println("I am so good at it!");
                    }
                    else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                        System.out.println("You are lying!");
                    }
                    else{
                    System.out.println("You didn't answer my question.");
                    }
                    //end of final judge
                }
                else if (no1.equals(larger6)||no2.equals(larger6)){
                    System.out.print("Is it less than 3? (input Y/N or y/n): ");
                    String less3=myScanner.next();
                    //1 or 5
                        if (yes1.equals(less3)||yes2.equals(less3)){
                            System.out.print("Is your number 1? (input Y/N or y/n): ");
                            //end of guessing
                            //final judge
                            String finalJudge=myScanner.next();
                            if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                                System.out.println("I am so good at it!");
                            }
                            else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                                System.out.println("You are lying!");
                            }
                            else{
                            System.out.println("You didn't answer my question.");
                            }
                            //end of final judge
                        }
                        else if (no1.equals(less3)||no2.equals(less3)){
                            System.out.print("Is your number 5? (input Y/N or y/n): ");
                            //end of guessing
                            //final judge
                            String finalJudge=myScanner.next();
                            if (yes1.equals(finalJudge)||yes2.equals(finalJudge)){
                                System.out.println("I am so good at it!");
                            }
                            else if (no1.equals(finalJudge)||no2.equals(finalJudge)){
                                System.out.println("You are lying!");
                            }
                            else{
                                System.out.println("You didn't answer my question.");
                            }
                            //end of final judge
                        }
                        else{
                            System.out.println("Sorry, it is an invalid input.");
                        }
                }
                else{
                    System.out.println("Sorry, it is an invalid input.");
                }
            }
            else{
                System.out.println("Sorry, it is an invalid input.");
            }
        }
        else{
            System.out.println("Sorry, it is an invalid input.");
        }
    }
}
//finallyyyyyy ended