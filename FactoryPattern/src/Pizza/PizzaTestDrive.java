package Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("Cheese");
        System.out.println("Wen ordered a " + nyPizza.name + "\n");

        Pizza chicagoPizza = chicagoStore.orderPizza("Cheese");
        System.out.println("Wayne ordered a " + chicagoPizza.name + "\n");
    }
}
