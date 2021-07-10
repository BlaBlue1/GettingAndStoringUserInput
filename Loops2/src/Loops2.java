import java.util.Scanner; //imported a library
public class Loops2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int total = 0, i= 0;
        double avg;
    /*
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a score: "); //prompt user
            score = kb.nextInt();
            total += score; //total = total + score
            //to get average of 10 scores
            System.out.printf("i=%d score=%d\n", i, score);
        }

        avg = total / 10;

     */

   /* while (i < 10) {
        System.out.println("Enter a score:");
        total += kb.nextInt();
        i++;
        */

        String response = "y";
        int count =0;
        while (response.charAt(0) == 'y') {
            System.out.println("Enter a score:");
            total += kb.nextInt();
            kb.nextLine();
            count++;

            System.out.println("Continue? (y/n):");
            response = kb.nextLine();
    }
/*
        System.out.println("Done!");
        System.out.printf("avg=%f\n", avg);
        */

    }
}
