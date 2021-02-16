package Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("Cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
}
