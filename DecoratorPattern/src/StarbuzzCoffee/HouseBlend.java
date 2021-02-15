package StarbuzzCoffee;

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        description = "House Blend Coffee";
        super.setSize(size);
    }

    @Override
    public Double cost() {
        double cost = 0;
        if (size == Size.TALL) {
            cost = 1.99;
        } else if (size == Size.GRANDE) {
            cost = 2.49;
        } else if (size == Size.VENTI) {
            cost = 2.89;
        }
        return cost;
    }

}
