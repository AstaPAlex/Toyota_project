package car.interaction;

import car.error.StartCarException;

public interface Driving {
    public boolean startDriving() throws StartCarException;
    public boolean endDriving();
}
