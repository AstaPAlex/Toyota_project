package car.equipment;

public class Usb {
    private boolean readyMusic = false;

    public void onMusic() {
        readyMusic = true;
    }

    public void offMusic() {
        readyMusic = false;
    }

    public boolean isReadyMusic() {
        return readyMusic;
    }
}
