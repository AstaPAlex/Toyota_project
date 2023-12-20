package car;

public enum Transmission {
    AUTOMATIC("АКПП"), ROBOT("Робот"), MANUAL("Механика");
    private final String transmission;

    Transmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }
}
