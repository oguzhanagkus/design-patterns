package SmartphoneCompany.Components.CPUs;

/**
 * This class represents a quad core CPU.
 */
public class QuadCoreCPU extends CPU {
    /**
     * Default constructor
     * @param memory memory size in GB
     * @param clockSpeed clock speed in GHz
     */
    public QuadCoreCPU(int memory, double clockSpeed) {
        this.memory = memory;
        this.clockSpeed = clockSpeed;
        this.coreCount = 4;
    }
}
