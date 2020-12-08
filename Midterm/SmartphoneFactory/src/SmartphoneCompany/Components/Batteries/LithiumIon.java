package SmartphoneCompany.Components.Batteries;

/**
 * This class represents LithiumIon batteries.
 */
public class LithiumIon extends Battery {
    /**
     * Default constructor.
     * @param capacity battery capacity in mAh
     * @param duration battery duration in hours
     */
    public LithiumIon(int capacity, int duration) {
        this.capacity = capacity;
        this.duration = duration;
        this.type = "LithiumIon";
    }
}
