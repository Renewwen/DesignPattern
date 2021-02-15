package StarbuzzCoffee;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI };

    String description;
    Size size;

    public Beverage() {
        description = "Unknown Beverage";
    }

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) { this.size = size; }

    public Size getSize() { return size; }

    public abstract Double cost();

}
