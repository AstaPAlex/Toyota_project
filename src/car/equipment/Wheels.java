package car.equipment;

import java.util.Arrays;

public class Wheels {
    private Boolean[] isNotPunctureWheels;
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Wheels(int radius) {
        this.radius = radius;
        isNotPunctureWheels = new Boolean[3];
        Arrays.fill(isNotPunctureWheels, true);
    }

    public boolean isNotPuncture() {
        for (Boolean wheel : isNotPunctureWheels) {
            if (!wheel) {
                return false;
            }
        }
        return true;
    }

    public boolean canChangeWheel(int radius) {
        if (this.radius == radius) {
            changeWheel();
            return true;
        } else {
            return false;
        }
    }

    public boolean changeWheel() {
        for (Boolean wheel : isNotPunctureWheels) {
            if (!wheel) {
                wheel = true;
                return true;
            }
        }
        return false;
    }

}
