package decorator;


public class Pepper extends Pizza {
    @Override
    public String getDescription() {
        return "Pepper";
    }

    @Override
    public int getCost() {
        return 4000;
    }
}