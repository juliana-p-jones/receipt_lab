package homework;

/*Create a program that generates a random number
        Use a switch statement to print out the month of the year based on the randomnly generated number
        For example: if random number is 4 then print April..number over 12 should print a default message*/

import java.util.Random;

public class Question2 {
    public static void main(String[] args) {

        Random random = new Random();
        int month = random.nextInt(12 + 1 - 1) + 1;
        switch (month) {
            case 1:
                System.out.println("January");
                // code block
                break;
            case 2:
                System.out.println("February");
                // code block
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                // code block
        }

    }
}
