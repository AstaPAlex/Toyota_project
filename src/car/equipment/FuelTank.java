package car.equipment;

public class FuelTank {
    private int countFuel;

    public FuelTank(int countFuel) {
        this.countFuel = countFuel;
    }

    public boolean emptyFuel() {
        return countFuel == 0;
    }

    public int getCountFuel() {
        return countFuel;
    }

    public void setCountFuel(int countFuel) {
        this.countFuel = countFuel;
    }
}
