import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomNames {
    public static void main(String [] args) {
        //Start by initializing the Random class (you need to import it)
        Random randomizer = new Random();
        //Ask the user for more names, initialize scanner
        Scanner keyboard = new Scanner(System.in);

        //Let's create our name list

          ArrayList<String> names = new ArrayList<>();
        names.add("Ruth");
        names.add("Elda");
        names.add("Bethel");
        //ask the user for more names
        for (int i = 1; i <= 3; i++) {
            //let's select a random name
            int randomIndex = randomizer.nextInt(names.size()); //g is the size
            //So that means randomIndex will be either 0, 1, 2, 3, 4, 5
            String randomName = names.get(randomIndex);
            System.out.println(randomName);

        }
    }
}

