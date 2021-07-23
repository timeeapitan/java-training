package decorator;

public class Cheese extends ToppingDecorator {
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " " + "Cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 3000;
    }
}