package car;

import car.equipment.*;
import factory.Country;

public class Dyna extends Truck {
    private static final Transmission TRANSMISSION = Transmission.MANUAL;
    private static final TypeCar TYPE_CAR = TypeCar.DYNA;
    private static final int DYNA_RADIUS = 17;
    private static final int MAX_SPEED = 170;
    private final PowerSocket powerSocket;

    public Dyna(String color, double price, FuelTank fuelTank, Motor motor,
                Electrics electrics, Headlight headlight, Country country,
                PowerSocket powerSocket) {
        super(color, price, DYNA_RADIUS, TRANSMISSION, fuelTank, motor, electrics, MAX_SPEED,
                headlight, TYPE_CAR, country);
        this.powerSocket = powerSocket;
    }

    @Override
    public final void functionalTesting() {
        super.functionalTesting();
        System.out.printf("Наличие розетки: %b \n\n", powerSocket.hasPowerSocket());
    }

}
