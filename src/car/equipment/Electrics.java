package car.equipment;

public class Electrics {
    private boolean isWork = true;

    public boolean isWork() {
        return isWork;
    }

    public void crush() {
        isWork = false;
    }

    public void fix() {
        isWork = true;
    }
}
