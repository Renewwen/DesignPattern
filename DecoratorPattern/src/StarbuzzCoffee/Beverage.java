package StarbuzzCoffee;

public abstract class Beverage {

    String description;

    public Beverage() {
        description = "Unknown Beverage";
    }

    public String getDescription() {
        return description;
    }

    public abstract Double cost();

}
