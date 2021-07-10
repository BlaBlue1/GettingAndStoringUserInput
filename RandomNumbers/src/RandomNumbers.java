import java.util.Random;
import java.util.ArrayList;

public class RandomNumbers {
    public static void main(String [] args) {
        //First, initialize the Random class yourself
        Random randomizer = new Random (); // reset the same class
        // Specify a bound (limit, non-inclusive)
        int randNumber = randomizer.nextInt(5); //selects a number starting from 0 until the limit
        for (int i = 1; i<=5; i++) {
            randNumber = randomizer.nextInt(5);
        }
         System.out.println("**********************");
        //Please pring out random number from 1-10 (including 10)
        for (int i= 1; i<=10; i++) {
            randNumber = randomizer.nextInt(10) + 1;
            System.out.println(randNumber);
        }
        //From a list of names, print out a random name
        System.out.println("*********************");
        ArrayList<String> name = new ArrayList<>();
        name.add("Ruth");
        name.add("Bethel");
        name.add("Elda");
        //this variable will save the random name
        String randName;
        //let's now select a random index number
        int sizeOfList = name.size(); //My list has 3 as the size
        int randIndex = randomizer.nextInt(sizeOfList); //0-2
        randName = name.get(randIndex);
        System.out.println(randName);
    }

}
