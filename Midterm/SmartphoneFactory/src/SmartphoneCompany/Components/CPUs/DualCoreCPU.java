package SmartphoneCompany.Components.CPUs;

/**
 * This class represents a dual core CPU.
 */
public class DualCoreCPU extends CPU {
    /**
     * Default constructor
     * @param memory memory size in GB
     * @param clockSpeed clock speed in GHz
     */
    public DualCoreCPU(int memory, double clockSpeed) {
        this.memory = memory;
        this.clockSpeed = clockSpeed;
        this.coreCount = 2;
    }
}
