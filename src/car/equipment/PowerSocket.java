package car.equipment;

public class PowerSocket {
    private static final String TEXT_POWER = "Телефон заряженэ\n";

    public void chargePhone() {
        System.out.println(TEXT_POWER);
    }

    public boolean hasPowerSocket() {
        return true;
    }


}
