package car;

import car.equipment.*;
import factory.Country;

public abstract class PassengerCar extends Car {
    protected final Cruise cruise;

    public PassengerCar(String color, double price, int radius, Transmission transmission,
                        FuelTank fuelTank, Motor motor, Electrics electrics, int maxSpeed,
                        Headlight headlight, TypeCar model, Cruise cruise, Country country) {
        super(color, price, radius, transmission, fuelTank, motor, electrics, maxSpeed,
                headlight, model, country);
        this.cruise = cruise;
    }

    @Override
     public void functionalTesting() {
        super.functionalTesting();
        System.out.printf("Включен Круиз: %b \n ", cruise.isOnCruise());
    }
}
