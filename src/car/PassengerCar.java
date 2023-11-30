package car;

import car.equipment.Cruise;

public abstract class PassengerCar extends Car {
    private final Cruise cruise;

    public PassengerCar(String color, String transmission, double price, int radius) {
        super(color, transmission, price, radius);
        cruise = new Cruise();
    }

    @Override
     public boolean functionalTesting() {
        super.functionalTesting();
         System.out.printf("Включен Круиз: %b \n ", cruise.isWork());
        return true;
     }
}
