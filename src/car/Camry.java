package car;

import car.equipment.*;
import factory.Country;

public class Camry extends PassengerCar {
    private static final TypeCar TYPE_CAR = TypeCar.CAMRY;
    private static final int CAMRY_RADIUS = 17;
    private static final int MAX_SPEED = 280;
    private static final Transmission TRANSMISSION = Transmission.AUTOMATIC;
    private final Usb usb;

    public Camry(String color, double price, FuelTank fuelTank, Motor motor,
                 Electrics electrics, Headlight headlight, Cruise cruise, Usb usb,
                 Country country) {
        super(color, price, CAMRY_RADIUS, TRANSMISSION, fuelTank, motor, electrics, MAX_SPEED,
                headlight, TYPE_CAR, cruise, country);
        this.usb = usb;
    }


    @Override
    public final void functionalTesting() {
        super.functionalTesting();
        System.out.printf("Подключена музыка к USB: %b \n\n ", usb.isReadyMusic());
    }

}
