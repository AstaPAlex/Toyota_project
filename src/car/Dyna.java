package car;

import car.equipment.PowerSocket;

public class Dyna extends Truck {
    private PowerSocket powerSocket;

    public Dyna(String color, String transmission, double price) {
        super(color, transmission, price, 20);
        powerSocket = new PowerSocket();
    }

    @Override
    public boolean functionalTesting() {
        super.functionalTesting();
        System.out.printf("Наличие розетки: %b \n ", true);
        System.out.println("__________________________________");
        return true;
    }

}
