package car.equipment;

public class Headlight {
    private boolean isWork;

    public Headlight() {
        isWork = false;
    }

    public boolean isWork() {
        return isWork;
    }

    public boolean onWork() {
        isWork = true;
        return true;
    }

    public boolean offWork() {
        isWork = false;
        return true;
    }
}
