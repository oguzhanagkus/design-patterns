package SmartphoneCompany.Components.Batteries;

/**
 * This class represents LithiumCobalt batteries.
 */
public class LithiumCobalt extends Battery {
    /**
     * Default constructor.
     * @param capacity battery capacity in mAh
     * @param duration battery duration in hours
     */
    public LithiumCobalt(int capacity, int duration) {
        this.capacity = capacity;
        this.duration = duration;
        this.type = "LithiumCobalt";
    }
}
