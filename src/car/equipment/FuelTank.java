package car.equipment;

public class FuelTank {
    private int countFuel;

    public FuelTank(){
        countFuel = 0;
    }

    public boolean emptyFuel() {
        if (countFuel == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getCountFuel() {
        return countFuel;
    }
}
