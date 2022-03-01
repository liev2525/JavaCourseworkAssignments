
package soccerteams;
import javax.swing.JOptionPane;
public class SoccerTeams {

    public static void main(String[] args) {
        //Declare variables
        int players;//Calc # of players
        int teamSize; //Calc players per team
        int teams;//Calc # of soccer teams
        
        //Declare string input via JOptionPane
        String input; 
        
        //Set restrictions "Validation"
        final int MIN_PLAYERS = 9;
        final int MAX_PLAYERS = 15;
        
        //Get number of players per team
        input = JOptionPane.showInputDialog("Enter the number of players per"
                + " team\"");
        teamSize = Integer.parseInt(input);
        
        //Validate the number entered
        while (teamSize < MIN_PLAYERS || teamSize < MAX_PLAYERS)
        {
            input = JOptionPane.showInputDialog("The number must be at least "
                    + "MIN_PLAYERS and no more than MAX_PLAYERS");
            teamSize = Integer.parseInt (input);
            System.out.println ("Enter the number of players ");
        }
        
        //Get the number of available players
        input = JOptionPane.showInputDialog("Enter the avialble number "
                + "of players");
            players = Integer.parseInt(input);
        //Validate the number entered
        while (players <0)
        {
            input = JOptionPane.showInputDialog ("Enter 0 or greater ");
            players = Integer.parseInt(input);
        }
        
        //Calculate number of teams
        teams = players/teamSize;
        //Calculate number of leftover players
        leftover = players % teamSize;
        //Display results
        
        }
        
        
        
        System.exit (0);
    }
    
}
