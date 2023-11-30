package car.equipment;

public class Usb {
    private boolean readyMusic;

    public Usb() {
        readyMusic = false;
    }

    public boolean onMusic() {
        readyMusic = true;
        return true;
    }

    public boolean offMusic() {
        readyMusic = false;
        return true;
    }

    public boolean isReadyMusic() {
        return readyMusic;
    }
}
