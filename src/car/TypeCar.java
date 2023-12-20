package car;

public enum TypeCar {
    CAMRY("Camry", 5_000), DYNA("Dyna", 12_000), HIANCE("Hiance", 10_000), SOLARA("Solara", 8_000);
    private final String typeCar;
    private final double costPrice;

    TypeCar(String typeCar, double costPrice) {
        this.typeCar = typeCar;
        this.costPrice = costPrice;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public double getCostPrice() {
        return costPrice;
    }
}
