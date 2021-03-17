package homework;
/*(i)
        Print from 10 - 1 with a for loop and a while loop
        Use continue if number is equal to 5 (only on one of your loops)
        (ii)
        Write a loop that prints 1 - 5 but break out at 3*/

public class Question4 {
    public static void main(String[] args) {
        /*int x = 10;*/
        for(int x =10; x >= 0; x -- ) {
            System.out.println(x); // prints 10 - 1 for loop
        }

        System.out.println("\r\n"); // break

        int x = 10;
        while(x >= 0){
            System.out.println(x);
            x--;
        } // prints 10 - 1 while loop

        System.out.println("\r\n"); // break

        int y = 1;
        while(y <= 5){
            System.out.println(y);
            if (y == 3){
                return;
            }
            y++;
        } // prints 10 - 1 while loop


    }
}
