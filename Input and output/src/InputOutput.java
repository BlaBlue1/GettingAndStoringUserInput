import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // datatype, variable = value
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is your first name?");
        String myAnswer = keyboard.next(); //asking the user for an input, .next() will stop at the first space

        int age = keyboard.nextInt();
        System.out.println(age);





        System.out.println(myAnswer);




    }
}
