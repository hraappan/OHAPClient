package fi.oulu.tol.esde35.ohapclient35;

import java.util.Observer;

/**
 * Created by Hannu Raappana on 30.4.2015.
 *
 * Used to inform the observers about changes in the system.
 */
public interface DeviceObserver {

        public void deviceStateChanged();

}