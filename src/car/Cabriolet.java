package car;

public abstract class Cabriolet extends PassengerCar {
    private boolean isRoofUp;
    public Cabriolet(String color, String transmission, double price, int radius) {
        super(color, transmission, price, radius);
        isRoofUp = true;
    }

    public boolean roofUp() {
        isRoofUp = true;
        return true;
    }

    public boolean roofDown() {
        isRoofUp = false;
        return true;
    }

    public boolean isRoofUp() {
        return isRoofUp;
    }

    @Override
    public boolean functionalTesting() {
        super.functionalTesting();
        System.out.printf("Наличие откидной крыши: %b \n ", isRoofUp);
        return true;
    }
}
