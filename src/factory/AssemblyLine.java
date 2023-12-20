package factory;

import car.*;
import factory.exeption.CountyFactoryNotEqualException;

public class AssemblyLine {
    private final Fabric fabric;
    private final Country country;

    public AssemblyLine(Country country, Fabric fabric) throws CountyFactoryNotEqualException {
        if (!country.equals(fabric.getCountry())) {
            throw new CountyFactoryNotEqualException(fabric.getCountry(), country);
        }
        this.fabric = fabric;
        this.country = country;
    }

    public Camry createCamry(String color, double price) {
        Camry camry = new Camry(
                color,
                price,
                fabric.getFuelTank(),
                fabric.getMotor(),
                fabric.getElectrics(),
                fabric.getHeadlight(),
                fabric.getCruise(),
                fabric.getUsb(),
                Country.CHINA
        );
        return camry;
    }

    public Solara createSolara(String color, double price) {
        Solara solara = new Solara(
                color,
                price,
                fabric.getFuelTank(),
                fabric.getMotor(),
                fabric.getElectrics(),
                fabric.getHeadlight(),
                fabric.getCruise(),
                fabric.getMiniIceBox(),
                Country.CHINA
        );
        return solara;
    }

    public Hiance createHiance(String color, double price) {
        Hiance hiance = new Hiance(
                color,
                price,
                fabric.getFuelTank(),
                fabric.getMotor(),
                fabric.getElectrics(),
                fabric.getHeadlight(),
                Country.CHINA
        );
        return hiance;
    }

    public Dyna createDyna(String color, double price) {
        Dyna dyna = new Dyna(
                color,
                price,
                fabric.getFuelTank(),
                fabric.getMotor(),
                fabric.getElectrics(),
                fabric.getHeadlight(),
                Country.CHINA,
                fabric.getPowerSocket()
        );
        return dyna;
    }

}
