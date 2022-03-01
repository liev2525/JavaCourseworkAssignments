

package LoanQualifier.java;

import java.util.Scanner;
        
public class LoanQualifier
{
public static void main (String [] args)
{
    /**Declare variable info*/
double salary;
double yearsOnJob;

/**Declare user keyboard entries to be entered into keyboard*/
Scanner keyboard;
    keyboard = new Scanner (System.in);

//Display output to obtain user info
System.out.println ("What is your salary?");
salary = keyboard.nextDouble ();
System.out.println ("How many years have you been at your job?");
yearsOnJob = keyboard.nextDouble ();

//Set conditions
    if (salary >= 30000)
    {
       if (yearsOnJob >= 2)
{
    System.out.println ("You qualify for the loan);
    }
        else
    {
          System.out.println ("You must have been on job atleast 2 years to" +
                  "qualify");
    }
       
       
    }
    else
    {
    System.out.println ("You must earn atleast 30000 to qualify");
}
}
}


 

 

