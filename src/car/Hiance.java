package car;

public class Hiance extends Truck {
    private boolean spareWheel;

    public Hiance(String color, String transmission, double price) {
        super(color, transmission, price, 20);
        spareWheel = true;
    }

    @Override
    public boolean functionalTesting() {
        super.functionalTesting();
        System.out.printf("Наличие запасного колеса: %b \n", spareWheel);
        System.out.println("__________________________________");
        return true;
    }
}
