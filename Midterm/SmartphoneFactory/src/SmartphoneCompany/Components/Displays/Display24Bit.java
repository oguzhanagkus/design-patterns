package SmartphoneCompany.Components.Displays;

/**
 * This class represents 24 bit displays.
 */
public class Display24Bit extends Display {
    /**
     * Default constructor.
     * @param size display size in inches
     */
    public Display24Bit(double size) {
        this.size = size;
        this.bitDepth = 24;
    }
}
