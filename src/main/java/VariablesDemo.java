import java.sql.SQLOutput;

public class VariablesDemo {

    public static void main (String[] args){
        //Calculate the area of rectangle
        int length = 5;
        int width = 3;
        int rectangleArea = length * width;

        //string concatenation -> adding variable to the end of the string
        System.out.println("The area of the rectangle is: " + rectangleArea);

        //calculate the area of a triangle with decimal point using double for precision
        double base = 5.75;
        double height = 3.25;
        double triangleArea = .5 * base * height;

        //string concatenation -> adding variable to the end of the string
        System.out.println("The area of the triangle is: " + triangleArea);

        boolean on = true;
        boolean off = false;

        System.out.println("On: " + on + "\nOff: " + off);

        String name = "Joseph";
        String nickName = name.substring(0,2);

        System.out.println(" Hello " + nickName);
    }
}
