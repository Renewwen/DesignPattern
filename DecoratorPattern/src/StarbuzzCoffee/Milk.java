package StarbuzzCoffee;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public Double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.49;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.59;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.69;
        }
        return cost;
    }

}
