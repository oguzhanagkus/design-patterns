package SmartphoneCompany.Components.Displays;

/**
 * This class represents 24 bit displays.
 */
public class Display32Bit extends Display {
    /**
     * Default constructor.
     * @param size display size  in inches
     */
    public Display32Bit(double size) {
        this.size = size;
        this.bitDepth = 32;
    }
}
