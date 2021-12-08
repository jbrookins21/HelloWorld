public class ComputerApp {
    public static void main(String[] args) {
        Computer wcciLaptop = new Computer("Dell", "Latitude", 500.00, 16);

        System.out.println("Here is some information on your computer: ");
        System.out.println("Make: " + wcciLaptop.getmake());
        System.out.println("Model: " + wcciLaptop.getmodel());
        System.out.println("Price: " + wcciLaptop.getprice());
        System.out.println("Memory: " + wcciLaptop.getMemory());

        wcciLaptop.download();
        System.out.println(wcciLaptop);

    }
}
