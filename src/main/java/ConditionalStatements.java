public class ConditionalStatements {

    public static void main(String[] args) {
        //if statements execute condition evaluations to true
        int heightInInches = 73;
        //parentheses contain the condition for the if statement
        // must evaluate to a boolean value
        if( heightInInches >= 60 ){
            System.out.println("You are tall enough to ride");
        } else if (heightInInches >= 30){
            System.out.println("Try Weenie hut juniors.");
        } else {
            System.out.println("You are too short to get into the salty spitoon.");
        }


        //case/switch statements are like if else statements but less work
        String ageGroup = "Youngster";
        switch (ageGroup) {
            case "adult":
                System.out.println("You can ride the rollercoaster!");
            case "youngster":
                System.out.println("The teacups are fun.");
                break;
            default:
                System.out.println("Oh,you must be a toddler. Toddle on!");
        }


        //are you able to drive based on age
        int age = 12;
        if (age >= 16) {
            System.out.println("you are old enough to drive");
        } else if(age ==15){
            System.out.println("You can get your learners permit");
        } else {
            System.out.println("You are not old enough to drive");
        }






    }
}
