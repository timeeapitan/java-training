package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza chickenFiesta = new Chicken();
        chickenFiesta = new Barbeque(chickenFiesta);
        System.out.println(chickenFiesta.getDescription());
        System.out.println(chickenFiesta.getCost());

        System.out.println("----------------------------------------------------");

        Pizza margherita = new Margherita();
        margherita = new Jalapeno(margherita);
        System.out.println(margherita.getDescription());
        System.out.println(margherita.getCost());

        System.out.println("----------------------------------------------------");

        Pizza farmHouse = new FarmHouse();
        farmHouse = new Cheese(farmHouse);
        System.out.println(farmHouse.getDescription());
        System.out.println(farmHouse.getCost());

        System.out.println("----------------------------------------------------");

        Pizza pepper = new Pepper();
        pepper = new Tomato(pepper);
        System.out.println(pepper.getDescription());
        System.out.println(pepper.getCost());


    }
}