import java.util.Scanner;

public class UserInput {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("What is your name?");
            String name = input.nextLine();
            System.out.println("Hello, " + name);
            System.out.println("Enter your favorite number: ");
            int favoriteInteger = input.nextInt();
            System.out.println("What about decimal values? ");
            double favoriteDouble = input.nextDouble();
            System.out.println("Based on what you told me your name is " + name +
                    " your favorite number is " + favoriteInteger + " and your favorite decimal value is "
            + favoriteDouble);
            input.close();
        }
    }

