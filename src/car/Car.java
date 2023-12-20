package car;

import car.equipment.*;
import car.exeption.StartCarException;
import car.interaction.Driving;
import car.interaction.FunctionalTesting;
import car.interaction.Lighting;
import factory.Country;

public abstract class Car implements Driving, Lighting, FunctionalTesting {
    private static final String TEST_TEXT = """
             Модель: %s\s
             Страна производства: %s\s
             Цвет: %s\s
             Трансмиссия: %s\s
             Макс. скорость: %d\s
             Радиус колес: %d\s
             Цена: %.2f$\s
             Машина движется: %b\s
             Колеса целы: %b\s
             Мотор работоспособен: %b\s
             Объем бензина в баке: %d\s
             Электрика работоспособна: %b\s
             Фары включены: %b\s
            \s""";
    protected final String color;
    protected final int maxSpeed;
    protected final Transmission transmission;
    protected boolean isDriving;
    protected final Wheel[] wheels;
    protected final FuelTank fuelTank;
    protected final Motor motor;
    protected final Electrics electrics;
    protected final double price;
    protected final Headlight headlight;
    protected Country country;
    protected TypeCar typeCar;
    protected final int radius;

    public Car(String color, double price, int radius, Transmission transmission,
               FuelTank fuelTank, Motor motor, Electrics electrics, int maxSpeed,
               Headlight headlight, TypeCar typeCar, Country country) {
        this.color = color;
        this.price = price;
        this.radius = radius;
        wheels = new Wheel[] {
            new Wheel(radius),
            new Wheel(radius),
            new Wheel(radius),
            new Wheel(radius),
        };
        this.transmission = transmission;
        this.fuelTank = fuelTank;
        this.motor = motor;
        this.electrics = electrics;
        this.maxSpeed = maxSpeed;
        this.headlight = headlight;
        this.country = country;
        this.typeCar = typeCar;
    }

    @Override
    public void startDriving() throws StartCarException {
        if (!hasFourWheels()) {
            throw new StartCarException("Не 4 колеса!");
        } else if (!wheelsWork()) {
            throw new StartCarException("Колесо проколото!");
        } else if (!fuelTank.emptyFuel()) {
            throw new StartCarException("Бак пустой!");
        } else if (!motor.isWork()) {
            throw new StartCarException("Мотор не работает!");
        } else if (!electrics.isWork()) {
            throw new StartCarException("Не работает электрика!");
        } else {
            isDriving = true;
        }
    }

    @Override
    public void endDriving() {
        isDriving = false;
    }

    @Override
    public void onHeadlight() {
        headlight.onHeadLight();
    }

    @Override
    public void offHeadlight() {
        headlight.offHeadLight();
    }

    @Override
    public void functionalTesting() {
        System.out.printf(TEST_TEXT, typeCar.getTypeCar(), country.getCountry(), color,
                transmission.getTransmission(), maxSpeed, radius,
                price, isDriving, wheelsWork(), motor.isWork(),
                fuelTank.getCountFuel(), electrics.isWork(), headlight.isOnHeadLight());
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public double getPrice() {
        return price;
    }

    private boolean hasFourWheels() {
        for (Wheel wheel : wheels) {
            if (wheel == null) {
                return false;
            }
        }
        return true;
    }

    private boolean wheelsWork() {
        for (Wheel  wheel : wheels) {
            if (!wheel.isWheelWork()) {
                return false;
            }
        }
        return true;
    }
}
