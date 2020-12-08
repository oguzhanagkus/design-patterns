package SmartphoneCompany.Components.Batteries;

/**
 * This class represents LithiumBoron batteries.
 */
public class LithiumBoron extends Battery {
    /**
     * Default constructor.
     * @param capacity battery capacity in mAh
     * @param duration battery duration in hours
     */
    public LithiumBoron(int capacity, int duration) {
        this.capacity = capacity;
        this.duration = duration;
        this.type = "LithiumBoron";
    }
}
