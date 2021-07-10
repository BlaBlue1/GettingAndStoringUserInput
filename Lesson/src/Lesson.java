import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        //Create ONE string variable to store the output of 5 words that a user will enter at random.

        // I need 5 words from the user. Lets do that 1 at a time.
        String firstName = "Rey";
        String midName = "E.";
        System.out.println(firstName + midName + " Aponte");

        // How do I ask the user for any information? So that means I need scanner

        // 1. Ask the user for a word,
        // 2. save that word into a variable

        //creating scanner object for it to be able to read whatever the user types in
        Scanner keyboard = new Scanner(System.in);

        String output; //variable
        // System.out.println("What is your name?"); //prompt
        // output = keyboard.nextLine(); //for it to read the next line and store it the output variable
        // System.out.println(output);

        for (int count = 1; count <= 5; count++) {
            // we created a variable to count our loops and we pesified when the loop should stop and we also set that it should inrease by 1

            System.out.println("What is your name?"); //prompt
            output = keyboard.nextLine(); //for it to read the next line and store it the output variable
            System.out.println(output);

        }


        String repeat = "yes";
        while (repeat.equals("yes") || repeat.equals("Yes")) {
            System.out.println("Do you want me to repeat?");
            repeat = keyboard.nextLine();


        }


    }