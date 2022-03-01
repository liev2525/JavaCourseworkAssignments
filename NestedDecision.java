
package nesteddecision;
import javax.swing.JOptionPane;
public class NestedDecision 
{
    public static void main(String[] args) 
    {
    //Declare variable(s)
    int testScore;//To hold test score input
    
    //Declare user input
    String input;//To hold user input 
    
    //Get user info
    input = JOptionPane.showInputDialog ("Enter your numeric test score and I" +
            "will tell you the grade ");
    testScore = Integer.parseInt(input); //turn user input into double
    
    //Display grade
    if (testScore <60)
        JOptionPane.showMessageDialog (null, "Your grade is F. ");
    else if(testScore<70)
        JOptionPane.showMessageDialog(null, "Your grade is D. ");
    else if(testScore<80)
        JOptionPane.showMessageDialog(null, "Your grade is a C. ");
    else if (testScore<90)
        JOptionPane.showMessageDialog(null, "Your grade is a B.");
    else if (testScore<=100)
        JOptionPane.showMessageDialog(null, "Your grade is a A.");
    else 
        JOptionPane.showMessageDialog(null, "Invalid score.");
          
System.exit (0);
}
}