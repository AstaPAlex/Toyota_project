package car.equipment;

public class Headlight {
    private static final String STATUS_WORK = "Фары включены: %b\n";
    private boolean isOnHeadLight = false;

    public void onHeadLight() {
        isOnHeadLight = true;
        info();
    }

    public void offHeadLight() {
        isOnHeadLight = false;
        info();
    }

    private void info() {
        System.out.printf(STATUS_WORK, isOnHeadLight);
    }

    public boolean isOnHeadLight() {
        return isOnHeadLight;
    }
}
