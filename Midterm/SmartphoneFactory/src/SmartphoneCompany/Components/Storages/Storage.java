package SmartphoneCompany.Components.Storages;

/**
 * This abstract class represents a storage element. It has internal and external fields.
 */
public abstract class Storage {
    int internal;
    int external;

    /**
     * @return storage specifications
     */
    @Override
    public String toString() {
        return "Storage -> " + internal + "GB + max. " + external + "GB MicroSD card support\n";
    }
}
