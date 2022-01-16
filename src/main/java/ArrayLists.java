import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> giantWords = new ArrayList<String>();
        giantWords.add("fee");
        giantWords.add("fie");
        giantWords.add("foe");
        System.out.println(giantWords);
        System.out.println("my list has " + giantWords.size() + " elements");

        giantWords.add("fum");
        System.out.println(giantWords);
        System.out.println("my list has " + giantWords.size() + " elements");

        //primitive	class
        //boolean	Boolean
        //char	Character
        //int	Integer
        //long	Long
        //double	Double
        //short	Short
        //byte	Byte
        //double	Double
        //float	Float
        // every primitive has a class to be used in ArrayLists

        ArrayList<Integer> answers = new ArrayList<>();
        int ultimateAnswer = 42;
        answers.add(86);

        System.out.println("The answers are: " + answers);

        int asIntegerObject = ultimateAnswer;
        System.out.println("The ultimate answer is " + asIntegerObject);


        System.out.println("Are you out of answers? " + answers.isEmpty());
        System.out.println(answers);
        answers.clear();
        System.out.println(answers.isEmpty());

        ArrayList<String> myTools = new ArrayList<>();
        myTools.add("hammer");
        myTools.add("shovel");
        myTools.add("wrench");

        if(myTools.contains("hammer")){
            System.out.println("I have a hammer");
        }

        System.out.println("Shovel is element " + myTools.indexOf("shovel"));

        System.out.println(myTools);

        for(String word: giantWords) {
            System.out.println(word + "! ");
        }
        System.out.println();

        ArrayList<String> myAnimals = new ArrayList<>();
        myAnimals.add("Giraffe");
        myAnimals.add("Seal");
        myAnimals.add("Octopus");
        myAnimals.add("Squid");
        myAnimals.add("Jellyfish");

        System.out.println(myAnimals);
        for(String word: myAnimals) {
            System.out.println(word + "! ");
        }

        ArrayList<Boolean> myRights= new ArrayList<>();
        myRights.add(true);
        myRights.add(false);
        myRights.add(false);
        myRights.add(true);
        myRights.add(false);

        System.out.println(myRights);

        for (Boolean word : myRights){
            if (word){
                System.out.println(word + " | " + "Better Bring an umbrella");
            } else if (!word){
                System.out.println(word + " | " + "No rain today, enjoy the sun");
            }
        }

        }


    }

