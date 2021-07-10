import java.util.ArrayList;
public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("eggs");
        myList.add("milk");
        System.out.println(myList);

        // Find out how many items your array list has.
        int arrayListSize = myList.size();
        System.out.println("your list has" + arrayListSize + " items");

        //loop through my items, with a 'traditional' for loop
        System.out.println("***********************");
        for (int index = 0; index < myList.size(); index++) {
            String item = myList.get(index);

            System.out.println((index + 1) + ". " + item);
        }
        // Loop through my items, with an 'Enhanced' for loop
        // State the datatype of the arraylist for your iterator variable (item)
        //then you specify the list you want to loop through
        int counter = 1;
        for (String item : myList) {
            System.out.println(counter + ". " + item + ", index at : " + (counter -1));
            counter++; //same as doing counter = counter + 1;
        }System.out.println("***********************");

        //how to initialize an integer array list
        // you need to provide non-primitive data type 'cousin' of the primitive data type

        ArrayList<Integer> myNumberList = new ArrayList<Integer> ();
        int myNum = 8;

        myNumberList.add(myNum);
        myNumberList.add(210);
        myNumberList.add(10);
    }
}
