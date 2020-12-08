package SmartphoneCompany.Components.CPUs;

/**
 * This abstract class represents a CPU and a RAM.
 * RAM has memory field,
 * CPU has coreCount and clockSpeed fields.
 */
public abstract class CPU {
    int memory;
    int coreCount;
    double clockSpeed;

    /**
     * @return cpu and ram specifications
     */
    @Override
    public String toString() {
        return "CPU -> " + clockSpeed + "GHz, " + coreCount + " cores\n" +
               "RAM -> " + memory + "GB\n";
    }
}
