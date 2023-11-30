package car;

import car.equipment.*;
import car.error.StartCarException;
import car.interaction.Driving;
import car.interaction.FunctionalTesting;
import car.interaction.Lighting;

public abstract class Car implements Driving, Lighting, FunctionalTesting {
    private String color;
    private int maxSpeed;
    private String transmission;
    private boolean isDriving;
    private Wheels wheels;
    private FuelTank fuelTank;
    private Motor motor;
    private Electrics electrics;
    private double price;
    private Headlight headlight;

    public Car(String color, String transmission, double price, int radius) {
        this.color = color;
        this.transmission = transmission;
        isDriving = false;
        fuelTank = new FuelTank();
        motor = new Motor();
        electrics = new Electrics();
        this.price = price;
        this.maxSpeed = 180;
        wheels = new Wheels(radius);
        headlight = new Headlight();
    }

    @Override
    public boolean startDriving() throws StartCarException {
        if (!wheels.isNotPuncture()) {
            throw new StartCarException("Колесо проколото!");
        } else if (fuelTank.emptyFuel()) {
            throw new StartCarException("Бак пустой!");
        } else if (!motor.isWork()) {
            throw new StartCarException("Мотор не работает!");
        } else if (!electrics.isWork()) {
            throw new StartCarException("Не работает электрика!");
        } else {
            isDriving = true;
            return true;
        }
    }

    @Override
    public boolean endDriving() {
        isDriving = false;
        return true;
    }

    @Override
    public boolean onHeadlight() {
        headlight.onWork();
        return true;
    }

    @Override
    public boolean offHeadlight() {
        headlight.offWork();
        return true;
    }

    @Override
    public boolean functionalTesting() {
        System.out.println(this.getClass());
        System.out.printf(" Цвет: %s \n Трансмиссия: %s \n Макс. скорость: %d \n Радиус колес: %d \n " +
                "Цена: %.2f$ \n Машина движется: %b \n Колеса целы: %b \n Мотор работоспособен: %b \n" +
                " Объем бензина в баке: %d \n Электрика работоспособна: %b \n Фары включены: %b \n "
                , color, transmission, maxSpeed, wheels.getRadius(), price, isDriving, wheels.isNotPuncture(), motor.isWork(), fuelTank.getCountFuel(),
                electrics.isWork(), headlight.isWork());
        return true;
    }
}
