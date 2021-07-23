package decorator;

public class Jalapeno extends ToppingDecorator {
    private Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " " + "Jalapeno";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 1000;
    }
}