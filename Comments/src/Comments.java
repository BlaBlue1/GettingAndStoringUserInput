/*
My name Ruth Tadese
Date July 9, 2021
The name of the program is Comments
 */
import java.util.Scanner;
import java.util.Random;

public class Comments {
    public static void main(String[] args) {
        //this code allows a user to read a number from System.in
        Scanner scan = new Scanner(System.in);

        //I import the Random class earlier and now the below code will allow me to declare a random amount
        Random random = new Random();
        long from  = 1;
        long to = 100;
        int randomNumber = random.nextInt((int) (to - from + 1)) + (int) from;

        // notice the data types of the variables declared so far
        //(int) is an explicit cast that will convert a 'long' data type to an 'int' data type
        //
        int guessedNumber = 0;
        //% is a place holder and \n is a new line
        System.out.printf("The number is between %d and %d.\n", from, to);

        //
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber);
                   System.out.println("Your guess is too low!");
                else
                   System.out.println("you got it!");

        } while (guessedNumber !=randomNumber);
    }

}
