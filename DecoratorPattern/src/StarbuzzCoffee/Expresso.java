package StarbuzzCoffee;

public class Expresso extends Beverage{

    public Expresso(Size size) {
        description = "Expresso";
        super.setSize(size);
    }

    @Override
    public Double cost() {
        double cost = 0;
        if (size == Size.TALL) {
            cost = 0.99;
        } else if (size == Size.GRANDE) {
            cost = 1.49;
        } else if (size == Size.VENTI) {
            cost = 1.89;
        }
        return cost;
    }

}
