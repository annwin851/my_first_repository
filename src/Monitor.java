public class Monitor {

    private String name;
    private String model;
    private double price;

    private Monitor () {}

    public Monitor ( String name, String model, double price){

        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
