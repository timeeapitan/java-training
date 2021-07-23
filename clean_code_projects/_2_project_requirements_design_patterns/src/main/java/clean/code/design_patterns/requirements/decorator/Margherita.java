package decorator;

public class Margherita extends Pizza {
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public int getCost() {
        return 1000;
    }
}