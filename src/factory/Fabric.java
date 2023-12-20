package factory;

import car.equipment.*;
import factory.Country;

public class Fabric {
    private final Country country;

    public Fabric(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public Cruise getCruise() {
        return new Cruise();
    }

    public Electrics getElectrics() {
        return new Electrics();
    }

    public FuelTank getFuelTank() {
        return new FuelTank(0);
    }

    public MiniIceBox getMiniIceBox() {
        return new MiniIceBox();
    }

    public Motor getMotor() {
        return new Motor();
    }

    public PowerSocket getPowerSocket() {
        return new PowerSocket();
    }

    public Usb getUsb() {
        return new Usb();
    }

    public Headlight getHeadlight() {
        return new Headlight();
    }

    public Wheel getWheel(int radius) {
        return  new Wheel(radius);
    }
}
