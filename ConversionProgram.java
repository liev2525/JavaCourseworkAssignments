package conversionprogram;
import java.util.Scanner;
public class ConversionProgram {

            /**Write a method named "menu" to display menu selections */
       public static void menu () {
           System.out.print ("1. Convert to Kilometers\n2. Convert to inches\n"
                   + "3. Convert to feet\n4. Quit the program\n");
       }
       //Convert Meters to kilometers
       public static void showKilometers (double inputMeters)
       {
       double kilometers;
       kilometers = inputMeters * 0.001;
       System.out.println(inputMeters + "converted to kilometers is " 
               + kilometers);
        }       
       //Convert Meters to Inches 
       public static void showInches (double inputMeters){
        double inches;
        inches = inputMeters * 39.37;
        System.out.println (inputMeters + "converted to inches is" + inches);
       }
       //Convert Meters to Feet
        public static void showFeet (double inputMeters){
           double feet;
           feet = inputMeters * 3.281;
           System.out.println (inputMeters + "converted to feet is"+ feet);
        }
    public static void main(String[] args) {
        // Write a program that asks user to enter distance in meters
       //Define variables
       double inputMeters;
       double inputChoice;
       //Allow for keyboard input
       Scanner keyboard = new Scanner (System.in); 
       //Get user input
       System.out.println ("Enter a distance in meters:" );
       inputMeters = keyboard.nextDouble ();
       //input menu () method
       menu ();
       //Allow for user to input choice from menu
       System.out.println ("Enter your choice");
       inputChoice = keyboard.nextDouble ();//Define choice variable
           if (inputChoice == 1){
    showKilometers (inputMeters);
}    else if (inputChoice == 2){
    showInches (inputMeters);
}   else if (inputChoice == 3){
    showFeet (inputMeters);
}
       //Meters entered cannot be '0'
       while(inputMeters <0)
       {
        System.out.println("Please enter a number greater than zero");}
        inputChoice = keyboard.nextDouble ();//Allow user to input again 
    }

    

       }

   

       
    
    

