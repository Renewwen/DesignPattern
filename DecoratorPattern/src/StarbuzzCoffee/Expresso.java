package StarbuzzCoffee;

public class Expresso extends Beverage{

    public Expresso() {
        description = "Expresso";
    }

    @Override
    public Double cost() {
        return 0.99;
    }

}
