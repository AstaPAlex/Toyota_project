package car.equipment;

public class Cruise {
    private boolean onCruise = false;

    public void onCruise() {
        onCruise = true;
    }

    public void offCruise() {
        onCruise = false;
    }

    public boolean isOnCruise() {
        return onCruise;
    }
}
