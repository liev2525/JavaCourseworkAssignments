
package creditcard;
import java.util.Scanner;
public class CreditCard {

    public static void main(String[] args) {
        int annualSalary;
        double creditRating;
        String input; 
        //Allow for keyboard input
        Scanner keyboard = new Scanner (System.in);
                     
        // Ask user for Annual Salary
        System.out.println ("What is your annual salary? ");
        annualSalary = keyboard.nextInt();
        
        //Ask user credit rating
        System.out.println ("On a scale of 1 through 10, what is your credit "
                + "rating? (10 = excellent, 1 = very bad) ");
        creditRating = keyboard.nextDouble(); 
        //Determine if user qualifies for loan;
        if (annualSalary >= 20000 && creditRating >= 7)
        qualify ();
        else 
        noQualify ();
    }
        //qualify method informs user they do qualify
        public static void qualify ()
        {
            System.out.println("I'm sorry, you do not qualify for the CC");
        }
        public static void noQualify ()
        {
        System.out.println ("Congrats, you qualify for the CC! ");
        }
        
    }
    
}
