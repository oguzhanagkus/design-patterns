package SmartphoneCompany.Components.Batteries;

/**
 * This abstract class represents a battery. Each battery has capacity and duration field.
 * Also there different kind of batteries.
 */
public abstract class Battery {
    int capacity;   // mAh
    int duration;   // hours
    String type;    // Build type

    /**
     * @return battery specifications
     */
    @Override
    public String toString() {
        return "Battery -> " + type + ", " + capacity + "mAh, " + duration + " hours\n";
    }
}
