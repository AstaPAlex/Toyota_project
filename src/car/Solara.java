package car;

import car.equipment.*;
import factory.Country;

public class Solara extends Cabriolet {
    private static final int MAX_SPEED = 200;
    private static final int SOLARA_RADIUS = 16;
    private static final Transmission TRANSMISSION = Transmission.MANUAL;
    private static final TypeCar TYPE_CAR = TypeCar.SOLARA;
    private final MiniIceBox miniIceBox;

    public Solara(String color, double price, FuelTank fuelTank, Motor motor,
                  Electrics electrics, Headlight headlight, Cruise cruise,
                  MiniIceBox miniIceBox, Country country) {
        super(color, price, SOLARA_RADIUS, TRANSMISSION, fuelTank, motor, electrics, MAX_SPEED,
                headlight, TYPE_CAR, cruise, country);
        this.miniIceBox = miniIceBox;
    }

    @Override
    public void functionalTesting() {
        super.functionalTesting();
        System.out.printf("Наличие минихолодильника: %b \n\n", miniIceBox.hasMiniIceBox());
    }

}
