package StarbuzzCoffee;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new Expresso();
        beverage1 = new Milk(beverage1);
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }

}
