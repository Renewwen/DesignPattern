package StarbuzzCoffee;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public Double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += 0.29;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.39;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.49;
        }
        return cost;
    }

}
