package State;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

/**
 * This class implements LightState interface and represents yellow light.
 */
public class YellowState implements LightState {
    private int duration;
    private TrafficLight trafficLight;

    /**
     * Default constructor
     * @param trafficLight traffic light object
     */
    public YellowState(TrafficLight trafficLight) {
        this.duration = 3;
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
    public void turnOnYellow() throws InterruptedException {
        LocalTime localTime = LocalTime.now();
        System.out.print(localTime + " - ");
        System.out.println("Yellow");
        TimeUnit.SECONDS.sleep(duration);;
        trafficLight.setState(trafficLight.getRedState());
    }

    /**
     * Turn on the red light.
     * @throws InterruptedException time dependency
     */
    @Override
    public void turnOnRed() {
        // Nothing to do
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
