public class OperatorsDemo {

    public static void main(String[] args) {
        //operators for addition, subtraction,
        // multiplication, division, and remainder/modulus

        int a = 17;
        int b = 666;
        int c = 69;
        int d = 39;

        System.out.println(a + b);
        System.out.println(c - d);
        System.out.println(d * a);
        System.out.println(b / d);
        System.out.println(b % a);

        //increment and decrement operators -- & ++
        System.out.println( "increase " + ++b );
        System.out.println( "increase " + ++b );
        System.out.println( "decrease " + --b + "\n" + --b );

        //You can do single or multi digit increase or decrease
        int multiDigitIncrease = 5;
        multiDigitIncrease+=5;
        System.out.println("multi digit increase test " + multiDigitIncrease);

        int multiDigitDecrease = 5;
        multiDigitDecrease-=5;
        System.out.println("multi digit decrease test " + multiDigitDecrease);

        //equality operators == & !=
        System.out.println( "are " + a + " and " + c + " equal " + (a == c));
        //the above statement should read false because a and c are not equal
        System.out.println( "are " + d + " and " + d + " equal " + (d == d));
        //true
        System.out.println( "are " + d + " and " + d + " not equal " + (d != d));
        //false

        //relational operators > , >= , < , <=
        // if variable j holds 10 and k holds 15
        int j = 10, k = 15;

        System.out.println("is j > j " + (j > k));
        System.out.println("is j >= j " + (j >= k));
        System.out.println("is j < j " + (j < k));
        System.out.println("is j <= j " + (j <= k));


        //logical operators (boolean from comparing other booleans) && , ||
        // && conditional AND
        boolean kite = true, notKite = false;
        System.out.println("are kite and notKite the same " + ( kite && notKite));

        // || conditional OR
        System.out.println("are kite and notKite the same " + ( kite || notKite));

        //word problems
        //Lisa is cooking muffins. The recipe calls for 7 cups of sugar.
        // She has already put in 2 cups.
        // How many more cups does she need to put in?

        String Lisa, sugar, recipe, muffins;
        boolean isCooking = true, inOven = true;
        int recipeCup = 7;
        int lisaCup = 2;

        System.out.println(" Is Lisa cooking " + isCooking);
        System.out.println(" how many cups does Lisa need to add " + (recipeCup - lisaCup));

        //At a restaurant, Mike and his three friends decided to divide the bill evenly.
        // If each person paid $13 then what was the total bill?
        boolean divideBill = true;
        int people = 4;
        int paidSplit = 13;

        System.out.println( "The total bill costs " + (people * paidSplit));

        //How many packages of diapers can you buy with $40 if one package costs $8?
        int diaperPack = 8;
        int myWallet = 40;

        System.out.println("I can buy " + (myWallet / diaperPack + " packs of diapers "));

        //Last Friday Trevon had $29. Over the weekend he received some money for cleaning the attic.
        // He now has $41. How much money did he receive?
        int trevonAccount = 29;
        int accountAfterWeeekend = 41;

        System.out.println("Trevon made " +
                (accountAfterWeeekend - trevonAccount) +
                " dollars over the weekend.");


        //Last week Julia ran 30 miles more than Pranav.
        // Julia ran 47 miles. How many miles did Pranav run?

        int juliaMiles = 47 ;
        int parnayMiles = 0;

        System.out.println(" Parnay ran " + (juliaMiles - 30) + " miles");

        //How many boxes of envelopes can you buy with $12 if one box costs $3?
        int boxOfEnvelopes = 3;
        int spendingMoney = 12;

        System.out.println(" I can buy " + (spendingMoney / boxOfEnvelopes) + " boxes");


        //After paying $5.12 for a salad,
        // Norachai has $27.10. How much money did he have before buying the salad?
        double saladCost = 5.12;
        double norachaiMoney = 27.1;

        System.out.println(" Norachai had " +
                (norachaiMoney + saladCost) +
                " dollars before the salad");

        //331 students went on a field trip.
        // Six buses were filled and 7 students traveled in cars.
        // How many students were in each bus?
        int students = 331;
        int buses = 6;

        System.out.println("There were " + (students - 7) / buses  + " students in each bus");

        //Aliyah had $24 to spend on seven pencils.
        // After buying them she had $10. How much did each pencil cost?
        double aliyahMoney = 24;
        double pencilsPurchased = 7;
        double moneyLeft = 10;

        System.out.println("Aliyah bought pencils at " +
                ((aliyahMoney-moneyLeft) / pencilsPurchased) +
                " dollars each." );

        //The sum of three consecutive numbers is 72.
        // Print these numbers consecutively to the console.
        int sum = 72;
        int firstInteger = (sum-3)/3;
        int secondInteger = 1 + firstInteger;
        int thirdInteger = 2 + firstInteger;

        System.out.println("the consecutive integers are " +
                firstInteger + " " + secondInteger + " " +
                thirdInteger);

        //The sum of three consecutive even numbers is 48.
        // What is the smallest of these numbers?
        int sumEvensOnly = 48;
        int firstEvenInt = (sumEvensOnly - 6)/3 ;
        int secondEvenInt = firstEvenInt + 2;
        int thirdEvenInt = firstEvenInt + 4;

        System.out.println("The smallest of these three numbers is " + firstEvenInt);


        //Maria has boxes.
        // She buys seven more.
        // A week later, half of her boxes are destroyed in a fire,
        // leaving her with 22 boxes.
        // With how many did she start?
        int purchasedBoxes = 7;
        int mariaBoxes = (22 * 2) - purchasedBoxes;
        int fireBoxes = mariaBoxes / 2;

        System.out.println("Maria originally had " + mariaBoxes + " boxes.");







    }
}
