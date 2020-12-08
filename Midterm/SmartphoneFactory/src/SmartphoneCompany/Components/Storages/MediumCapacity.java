package SmartphoneCompany.Components.Storages;

/**
 * This class represents a storage device that supports MicroSD cards up to 64GB.
 */
public class MediumCapacity extends Storage {
    /**
     * Default constructor.
     * @param internal internal capacity
     */
    public  MediumCapacity(int internal) {
        this.internal = internal;
        this.external = 64;
    }
}
