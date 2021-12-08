public class Computer {

    //always make instance data private
    private String make;
    private String model;
    private double price;
    private int memory;

    //Getters return instance data you prefer to be public
    public String getmake() {
        return make;
    }


    public String getmodel() {
        return model;
    }

    public double getprice() {
        return price;
    }

    public int getMemory(){
        return memory;
    }

    //constructor which builds our object and assigns properties
    public Computer(String make, String model, double price, int memory) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }


    //method of behavior
    public void download(){
        memory -=10;
        System.out.println(this.make + " " + this.model + " " + " is downloading." );
    }

    //toString is a way to provide any info you would like
    @Override
    public String toString(){
        return "Make: " + this.make + " Model: " + this.model +
                " Price: "  + this.price + " " + this.memory;
    }

}

