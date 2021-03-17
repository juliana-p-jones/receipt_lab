package homework;

/*Using the Scanner class, Ask a number for their name and phone number
        If their name is Alice or Bob.. then print out a welcome message like "Welcome Alice" or "Welcome Bob"
        Else Print out.."Try again"*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        String name = userInput.nextLine();
        if(name.equals("Alice") || name.equals("Bob")){
            System.out.println("Welcome " + name + "!");
        } else {
            System.out.println("go die or something dumb sag!!");
        }
    }
}
