public class Arrays {
    public static void main(String[] args) {
        int [] cupValues = new int[5];
        cupValues[0] = 666;
        cupValues[1] = 475;
        cupValues[2] = 83;
        cupValues[3] = 89;
        cupValues[4] = 9;


        System.out.println(cupValues[0]);
        System.out.println(cupValues[1]);
        System.out.println(cupValues[2]);
        System.out.println(cupValues[3]);
        System.out.println(cupValues[4]);


        int numberOfCups = cupValues.length;
        System.out.println("Array length is: " + numberOfCups);

        cupValues = new int[2];
        System.out.println(cupValues.length);

        String[] giantWords = {"fee", "fie", "foe", "fum"};
        System.out.println(giantWords.length);

        String[] classMates = {"Dylan", "Dylan", "Dylan", "Dylan", "Dylan"};
        String[] classGPA = {"3.2", " 2.8", "4.1", "3.7", "1.3"};
        String[] topVacationSpots = {"Salar De Uyuni", "Maldives", "Nigeria"};
        System.out.println(topVacationSpots[0] + " " + topVacationSpots[2]);

        String lastName = "Johnson";
        System.out.println(lastName.length());


        String source = "this, that, the other";
        String[] elements = source.split(",");
        System.out.println(elements.length);

        //reference variable classMates above

        char[] firstLetters = classMates[0].toCharArray();

        for (int i = 0; i < 5; i++) {
            System.out.println(firstLetters[i]);
        }


    }

}
