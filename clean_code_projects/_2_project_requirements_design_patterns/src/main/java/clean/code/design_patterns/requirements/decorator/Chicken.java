package decorator;

public class Chicken extends Pizza {

    @Override
    public String getDescription() {
        return "Chicken";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
