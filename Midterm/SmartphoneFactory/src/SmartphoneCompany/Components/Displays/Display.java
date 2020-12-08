package SmartphoneCompany.Components.Displays;

/**
 * This abstract class represents a display. Each display has size and bitDepth field.
 */
public abstract class Display {
    double size;
    int bitDepth;

    /**
     * @return display specifications
     */
    @Override
    public String toString() {
        return "Display -> " + size + " inches, " + bitDepth + " bit\n";
    }
}
