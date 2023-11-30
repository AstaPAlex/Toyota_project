package car;

public abstract class Truck extends Car {
    private final int tonnage;

    public Truck(String color, String transmission, double price, int radius) {
        super(color, transmission, price, radius);
        tonnage = 20_000;
    }

    @Override
    public boolean functionalTesting() {
        super.functionalTesting();
        System.out.printf("Грузоподъемность, кг: %d \n ", tonnage);
        return true;
    }
}
