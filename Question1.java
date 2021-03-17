package homework;
/*Prompt a user to enter if they think the temperature is High, Low or Humid
        Based on the user's input print out one of these
        High: print out " sunblock may be needed"
        Low : print out " a coat may be needed"
        Humid: print out " it's muggy!"*/
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you think the temperature is high, low, or humid?");
        String response = userInput.nextLine();
        if(response.equals("high")) {
            System.out.println("Sunblock may be needed!");
        } else if (response.equals("low")) {
            System.out.println("A coat may be needed!");
        } else if (response.equals("humid")) {
            System.out.println("It's muggy AF!");
        } else {
            System.out.println("Please respond appropriately...");
        }

    }
}
