
package uppercasefileconverter;
import java.util.Scanner;
import java.io.*;
public class UpperCaseFileConverter {


    public static void main(String[] args)throws IOException {
        // Declare Variables
        String filename1;
        String filename2;
        String upper;
        String fileConvert;
       //Allow for keyboard input
       Scanner keyboard = new Scanner (System.in);
       //Get user input for first file
       System.out.println ("What is the first file name? ");
       filename1 = keyboard.nextLine();
       //Get user input for second file
       System.out.println ("What is the second file name? ");
       filename2 = keyboard.nextLine();
       
       //make sure file is there
       File file = new File (filename1);
       if (!file.exists()){
           System.out.println("The file filename1 is not found");
           System.exit (0);
       }
        //Open file for reading
        File file = new File (filename1);
        Scanner inputFile = new Scanner (file);
        
        PrintWriter outputFile = new PrintWriter (filename2);//Open file
        //Declare variables
        fileConvert = inputFile.nextLine ();
        upper = fileConvert.toUpperCase();
        
        //Read lines from file until no more are left
        while (inputFile.hasNext () ){
            //Read file name
            fileConvert = inputFile.nextLine();
            upper = fileConvert.toUpperCase ();
            
            //output write name to file
            outputFile.println(upper);
        }
        //Close file
        inputFile.close ();
        outputFile.close();
        
        }
               
               
               }
    

