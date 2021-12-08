public class BranchingStatements {

    public static void main(String[] args) {
        //even or odd
        System.out.println("Message for 42:" + chooseMessage(42));
        System.out.println("Message for 23:" + chooseMessage(23));
    }

    public static String chooseMessage(int input) {
        if (input % 2 == 0) {
            return "even steven!";
        }
        return "that's odd!";
    }

}
