package car.interaction;

import car.exeption.StartCarException;

public interface Driving {
    public void startDriving() throws StartCarException;

    public void endDriving();
}
