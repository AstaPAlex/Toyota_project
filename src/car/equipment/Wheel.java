package car.equipment;

public class Wheel {
    private final int radius;
    private boolean wheelWork;

    public Wheel(int radius) {
        this.radius = radius;
        wheelWork = true;
    }

    public boolean isWheelWork() {
        return wheelWork;
    }

    private void changeWheel() {
        wheelWork = true;
    }

    public int getRadius() {
        return radius;
    }

    public boolean tryChangeWheel(int radius) {
        if (this.radius == radius) {
            changeWheel();
            return true;
        } else {
            return false;
        }
    }

    public boolean hasWheel() {
        return true;
    }
}
