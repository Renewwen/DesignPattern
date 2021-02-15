package StarbuzzCoffee;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend(Beverage.Size.GRANDE);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 =
                new Milk(
                        new Milk(
                                new Mocha(
                                        new Expresso(Beverage.Size.VENTI))));
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }

}
