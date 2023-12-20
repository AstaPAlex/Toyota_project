package car;

import car.equipment.*;
import factory.Country;

public abstract class Truck extends Car {
    protected final int tonnage = 20_000;

    public Truck(String color, double price, int radius, Transmission transmission,
                 FuelTank fuelTank, Motor motor, Electrics electrics, int maxSpeed,
                 Headlight headlight, TypeCar typeCar, Country country) {
        super(color, price, radius, transmission, fuelTank, motor, electrics, maxSpeed, headlight,
                typeCar, country);
    }

    @Override
    public void functionalTesting() {
        super.functionalTesting();
        System.out.printf("Грузоподъемность, кг: %d \n ", tonnage);
    }
}
