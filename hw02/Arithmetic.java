//Yuchen Yang
//CSE 002 hw02
//2/2/2015

//Arithmetic
//getting familiar with variables

public class Arithmetic {
    public static void main (String [] agrs){
        double tax=0.06; // define the tax ratio
        // $ is part of the variable name below
        //socks    
            int socksNum=3; // number of socks
            double socksCost$=2.58; // cost of each pair of socks
        //glasses
            int glassesNum=6; //number of glasses
            double glassCost$=2.29; // cost per glass
        //envelopes
            int envelopesNum=1; //number of boxes of envelopes
            double envelopeCost$=3.25; // cost per box of envelopes
        //define totalCost    
            double socksTotalCost$, glassesTotalCost$, envelopesTotalCost$, allTotalCost$;
        //define tax
            double socksTax$, glassesTax$, envelopesTax$, allTotalTax$;
        //calculate totalCost and tax for each kind
        //data for socks
            socksTotalCost$=socksNum*socksCost$;
            socksTax$=socksTotalCost$*tax;
        //data for glasses
            glassesTotalCost$=glassesNum*glassCost$;
            glassesTax$=glassesTotalCost$*tax;
        //data for envelopes
            envelopesTotalCost$=envelopesNum*envelopeCost$;
            envelopesTax$=envelopesTotalCost$*tax;
        //data for total
            allTotalCost$=socksTotalCost$
            +glassesTotalCost$+envelopesTotalCost$; //cost of purchase before tax
            allTotalTax$=socksTax$
            +glassesTax$+envelopesTax$; //total tax need to pay for all purchase
        //cost of actually paid
            double actualPaid$=allTotalCost$+allTotalTax$;
        //print out    
        System.out.println("the cost of socks are $"+socksTotalCost$);
        System.out.println("the cost of glasses are $"+glassesTotalCost$);
        System.out.println("the cost of envelopes are $"+envelopesTotalCost$);
        System.out.println("the cost of all purchase are $"+allTotalCost$);
        System.out.println("the actual payment are $"
        +String.format("%.2f", actualPaid$));
        //found this method online, can eliminate extra digits in a more precise way
    }
}