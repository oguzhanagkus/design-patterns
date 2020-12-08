package SmartphoneCompany.Components.Storages;

/**
 * This class represents a storage device that supports MicroSD cards up to 128GB.
 */
public class HighCapacity extends Storage {
    /**
     * Default constructor.
     * @param internal internal capacity
     */
    public  HighCapacity(int internal) {
        this.internal = internal;
        this.external = 128;
    }
}
