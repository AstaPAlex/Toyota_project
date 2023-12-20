package car.equipment;

public class Motor {
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
