package State;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

/**
 * This class implements LightState interface and represents green light.
 */
public class RedState implements LightState {
    private int duration;
    private TrafficLight trafficLight;

    /**
     * Default constructor
     * @param trafficLight traffic light object
     */
    public RedState(TrafficLight trafficLight) {
        this.duration = 15;
        this.trafficLight = trafficLight;
    }

    /**
     * Turn on the green light.
     * @throws InterruptedException time dependency
     */
    @Override
    public void turnOnGreen() {
        // Nothing to do
    }

    /**
     * Turn on the yellow light.
     * @throws InterruptedException time dependency
     */
    @Override
    public void turnOnYellow() {
        // Nothing to do
    }

    /**
     * Turn on the red light.
     * @throws InterruptedException time dependency
     */
    @Override
    public void turnOnRed() throws InterruptedException {
        LocalTime localTime = LocalTime.now();
        System.out.print(localTime + " - ");
        System.out.println("Red");
        TimeUnit.SECONDS.sleep(duration);
        trafficLight.setState(trafficLight.getGreenState());
    }

    /**
     * Set new duration.
     * @param duration new duration
     */
    @Override
    public void update(int duration) {
        // Nothing to do
    }
}
