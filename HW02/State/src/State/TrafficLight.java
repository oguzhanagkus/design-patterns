package State;

/**
 * This class implements Observer interface and represents a traffic lights.
 */
public class TrafficLight implements Observer {
    private LightState greenState;
    private LightState yellowState;
    private LightState redState;
    private LightState state;

    /**
     * Default constructor.
     */
    public TrafficLight() {
        greenState = new GreenState(this);
        yellowState = new YellowState(this);
        redState = new RedState(this);
        state = greenState;
    }

    /**
     * Turn on the green lights.
     */
    public void turnOnGreen() {
        try {
            state.turnOnGreen();
        }
        catch (Exception error) {
            System.out.println(error);
        }
    }

    /**
     * Turn on the yellow lights.
     */
    public void turnOnYellow() {
        try {
            state.turnOnYellow();
        }
        catch (Exception error) {
            System.out.println(error);
        }
    }

    /**
     * Turn on the red lights.
     */
    public void turnOnRed() {
        try {
            state.turnOnRed();
        }
        catch (Exception error) {
            System.out.println(error);
        }
    }

    /**
     * Get green state object.
     * @return green state object
     */
    public LightState getGreenState() {
        return greenState;
    }

    /**
     * Get green yellow object.
     * @return yellow state object
     */
    public LightState getYellowState() {
        return yellowState;
    }

    /**
     * Get red state object.
     * @return red state object
     */
    public LightState getRedState() {
        return redState;
    }

    /**
     * Set new state.
     */
    public void setState(LightState state) {
        this.state = state;
    }

    /**
     * If high traffic detected, update green light duration.
     * @param flag changed or not
     */
    @Override
    public void update(boolean flag) {
        if (flag)
            greenState.update(90);
        else
            greenState.update(60);
    }
}
