public class NewLoopProject {
    public static void main(String[] args) {
        for (int index = 1; index <= 5; index++) {
            System.out.println("index = " + index);
        }
        System.out.println("***********");

        for (int index = 3; index <= 5; index = index + 3 ) {
            System.out.println("index = " + index);
        }
    }
}
