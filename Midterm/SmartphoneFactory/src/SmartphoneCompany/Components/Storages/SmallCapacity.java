package SmartphoneCompany.Components.Storages;

/**
 * This class represents a storage device that supports MicroSD cards up to 32GB.
 */
public class SmallCapacity extends Storage {
    /**
     * Default constructor.
     * @param internal internal capacity
     */
    public  SmallCapacity(int internal) {
        this.internal = internal;
        this.external = 32;
    }
}
