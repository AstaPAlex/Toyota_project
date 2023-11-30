package car.equipment;

public class Cruise {
    private boolean isWork;

    public Cruise() {
        isWork = false;
    }

    public boolean onCruise() {
        isWork = true;
        return true;
    }

    public boolean offCruise() {
        isWork = false;
        return true;
    }

    public boolean isWork() {
        return isWork;
    }
}
