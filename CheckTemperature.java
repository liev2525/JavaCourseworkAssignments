
package checktemperature;

import java.util.Scanner;
public class CheckTemperature {

    public static void main(String[] args) {
    //Declare Variables    
    Double temperature;
    final double MAX_TEMP = 102.5;
    //Allow for user input
    Scanner keyboard = new Scanner (System.in);
    
    //Allow user to input current temperature
    System.out.println ("Enter the substance's Celsius termperature: ");
    temperature = keyboard.nextDouble ();
    
    //As long as necessary, instruct technician to adjust the temperature
    while (temperature >= MAX_TEMP)
            {
               System.out.println("The temperature is too high  Turn down the");
               System.out.println("thermostat down and wait 5 minutes.");
               System.out.println("Then take the Celsius temperature again");
               System.out.print ("and enter it here: ");
               temperature = keyboard.nextDouble();
            }
    //Remind tech to check the temp again in 15 min.
    System.out.println ("The temperature is acceptable");
    System.out.println ("Check it again in 15 minutes");
    
    }
    
}
