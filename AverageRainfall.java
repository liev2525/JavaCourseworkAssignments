
package averagerainfall;
import java.util.Scanner;
        
public class AverageRainfall {

    public static void main(String[] args) {
      
    int totalMonths = 0;
    final int months = 12;
    int years;
    double monthlyRainfall;
    double totalRainfall=0;
    double averageRainfall;
    
            
    Scanner input = new Scanner (System.in);//Keyboard Input
    //Ask for number of years
    System.out.println ("Enter number of years");
    years = input.nextInt();
    //Validate the input
    while (years <1)
    {
        System.out.println ("Invalid Input. Enter 1 or more ");
                years = input.nextInt ();
    }
    //Ask for amount of rainfall
    System.out.println ("Enter inches of rainfall for each month ");
    //Create loop for each month
    for (int y=1; y<=years; y++)
    {
        for (int m=1; m<=months; m++)
        {
            switch (m)
            {
                case 1:
                    System.out.println ("January");
                    break;
                case 2:
                    System.out.println ("February: ");
                    break;
                case 3:
                    System.out.println ("March");
                    break;
                case 4: 
                    System.out.println ("April");
                    break;
                case 5:
                    System.out.println ("May");
                    break;
                case 6:
                    System.out.println ("June");
                    break;
                case 7:
                    System.out.println ("July");
                    break;
                case 8:
                    System.out.println ("August");
                    break;
                case 9:
                    System.out.println ("September");
                    break;
                case 10:
                    System.out.println ("October");
                    break;
                case 11:
                    System.out.println ("November");
                    break;
                case 12:
                    System.out.println ("December");
                    break;
            }
                 //Calculate monthly rainfall
                 monthlyRainfall = input.nextDouble();
                 totalRainfall += monthlyRainfall;//add monthly rainfall to total
        
                 totalMonths += months;//add months to total months
                 
                //Calculate Average
                averageRainfall = totalRainfall/monthlyRainfall;
                
                //Display output
                System.out.println ("Number of months: "+ totalMonths + 
                      "n\Totalrainfall: " + "inches" + "In average rainfall:");
        
            }
        }
    }
    
    
    
    
    }
    
}
