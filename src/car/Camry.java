package car;

import car.equipment.Usb;

public class Camry extends PassengerCar {
    private Usb usb;

    public Camry(String color, String transmission, double price) {
        super(color, transmission, price, 17);
        usb = new Usb();
    }

    @Override
    public boolean functionalTesting() {
        super.functionalTesting();
        System.out.printf("Подключена музыка к USB: %b \n ", usb.isReadyMusic());
        System.out.println("__________________________________");
        return true;
    }
}
