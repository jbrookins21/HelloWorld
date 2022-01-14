import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {
        //Key is String object, Value is String object
        Map<String, String> students;
        students = new HashMap<>();

        //hashmap method has two parameters
        //these will not be in this order in an output
        students.put("23A52", "Harvey Dent");
        students.put("68Z29", "Jessica Jones");
        students.put("57W85", "J Jonah Jameson");

        System.out.println("The Students are " + students);

        String studentName = students.get("23A52");
        System.out.println("Found the Student!");
        System.out.println("Stuent is: " + studentName);

        //List: characterized by being ordered. May contain duplicate elements.
        //Set: elements are unordered. Elements must be unique.
        //We will use set since keys are not duplicate and we don't care about the order
        Set<String> studentIds = students.keySet();
        System.out.println("The student IDs are " + studentIds);


        //Looking at values
        Collection<String> studentNames = students.values();
        System.out.println("The student names are " + studentNames);

        //least efficient way/ high effort - hashmaps are more efficent at finding individual items
        for(String id: students.keySet()) {
            System.out.println("This student's name is " + students.get(id));
        }

        //Looking at Entries - key and value (most efficient way)
        for(Map.Entry<String, String> entry: students.entrySet()) {
            System.out.println("The student's id is " + entry.getKey());
            System.out.println("The student's name is " + entry.getValue());
        }




    }
}
