
package energydrinkconsumption;
//This program calculates the approximate number of customers surveyed who 
//purchased one or more energy drinks per week, and of those surveyed, those 
//that preferred citrus flavored energy drinks
public class EnergyDrinkConsumption {

    public static void main(String[] args) {
        //Variables to hold number of customers surveyed 
        double percentSurveyed;
        double surveyed = 12467.0;
        double citrusFlavored;
        //Calculate  percent of those surveyed that purchased one or more
        //energy drink per week
        percentSurveyed = surveyed * 0.14;
        //Calculate those that favor citrus flavored energy drinks of those 
        //who drank one or more per week
        citrusFlavored = percentSurveyed*0.64;
        //Display Results
        System.out.println ("The approximate number of customers in the survey"
                + "who purchased one or more energy drinks per week is " + 
                percentSurveyed);
        System.out.println ("The approximate number of customers in the survey"
                + " who preferr citrus-flavored energy drinks is " + 
                citrusFlavored);
                
    }
    
}
