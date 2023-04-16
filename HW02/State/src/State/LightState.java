package State;

/**
 * Interface for traffic light colors.
 */
public interface LightState {
    /**
     * Turn on the green light.
     * @throws InterruptedException time dependency
     */
    void turnOnGreen() throws InterruptedException;

    /**
     * Turn on the yellow light.
     * @throws InterruptedException time dependency
     */
    void turnOnYellow() throws InterruptedException;

    /**
     * Turn on the red light.
     * @throws InterruptedException time dependency
     */
    void turnOnRed() throws InterruptedException;

    /**
     * If we need to change durations.
     */
    void update(int duration);
}
