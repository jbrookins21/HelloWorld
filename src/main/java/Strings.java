import java.util.Locale;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
       /* String palindrome = "A dog, a panic, in a pagoda";
        int palindromeLength = palindrome.length();
        System.out.println(palindrome + " has " + palindromeLength + " characters.");

        String cityName = "Cleveland";
        System.out.println("Length: " + cityName.length());
        System.out.println("Substring: " + cityName.substring(0,2));
        System.out.println("Single Character at Beginning: " + cityName.charAt(0) );
        System.out.println("Single Character at End: " + cityName.charAt(cityName.length()-1));
        */

        Scanner input = new Scanner(System.in);
        /*String password = "12345";

        System.out.println("Enter the password");
        String passwordEntered = input.nextLine();

        while(!passwordEntered.equals(password)){
            System.out.println("Try again...enter the right password this time");
            passwordEntered = input.nextLine();
        }
        System.out.println("Welcome to the program");
    }*/


        System.out.println("enter your email: ");
        String email = input.nextLine();

        System.out.println(email.toLowerCase());
    }
}
