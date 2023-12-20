package car;

import car.equipment.*;
import factory.Country;

public abstract class Cabriolet extends PassengerCar {
    protected boolean isRoofUp = true;

    public Cabriolet(String color, double price, int radius, Transmission transmission,
                     FuelTank fuelTank, Motor motor, Electrics electrics, int maxSpeed,
                     Headlight headlight, TypeCar typeCar, Cruise cruise, Country country) {
        super(color, price, radius, transmission, fuelTank, motor, electrics, maxSpeed,
                headlight, typeCar, cruise, country);
    }

    public void roofUp() {
        isRoofUp = true;
    }

    public void roofDown() {
        isRoofUp = false;
    }

    public boolean isRoofUp() {
        return isRoofUp;
    }

    @Override
    public void functionalTesting() {
        super.functionalTesting();
        System.out.printf("Откидная крыша поднята: %b \n ", isRoofUp);
    }
}
