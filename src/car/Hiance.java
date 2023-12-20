package car;

import car.equipment.*;
import factory.Country;

public class Hiance extends Truck {
    private static final Transmission TRANSMISSION = Transmission.MANUAL;
    private static final int MAX_SPEED = 180;
    private static final TypeCar TYPE_CAR = TypeCar.HIANCE;
    private static final int HIANCE_RADIUS = 20;
    private final Wheel spareWheel;

    public Hiance(String color, double price, FuelTank fuelTank, Motor motor,
                  Electrics electrics, Headlight headlight, Country country) {
        super(color, price, HIANCE_RADIUS, TRANSMISSION, fuelTank, motor, electrics, MAX_SPEED,
                headlight, TYPE_CAR, country);
        this.spareWheel = new Wheel(HIANCE_RADIUS);
    }

    @Override
    public final void functionalTesting() {
        super.functionalTesting();
        System.out.printf("Наличие запасного колеса: %b \n\n", spareWheel.hasWheel());
    }
}
