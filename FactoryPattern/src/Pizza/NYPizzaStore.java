package Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("Cheese")) {
            return new NYStyleCheesePizza();
        } else return null;
    }

}
