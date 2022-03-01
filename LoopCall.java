
package loopcall;
public class LoopCall {

    public static void main(String[] args) {
        // Defines and calls a simple method
        System.out.println ("Hello from the main method");
        for (int i=0;i<5;i++)
            displayMessage();
        System.out.println("Back in main method.");
    }
    public static void displayMessage()
    {
        System.out.println ("Hello from the displayMessage method");
    }
    }
