package SmartphoneCompany.Components.CPUs;

/**
 * This class represents a octa core CPU.
 */
public class OctaCoreCPU extends CPU {
    /**
     * Default constructor
     * @param memory memory size in GB
     * @param clockSpeed clock speed in GHz
     */
    public OctaCoreCPU(int memory, double clockSpeed) {
        this.memory = memory;
        this.clockSpeed = clockSpeed;
        this.coreCount = 8;
    }
}
