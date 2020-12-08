package SmartphoneCompany.Components.PhoneCases;

/**
 * This abstract class represents a phone case.
 * It has size, material and water resistance fields.
 */
public abstract class PhoneCase {
    double height;
    double width;
    double depth;
    String material;
    String waterResistance;
    int resistanceDepth;

    /**
     * @return phone case specifications
     */
    @Override
    public String toString() {
        return "Case -> " + height + "x" + width + "x" + depth + " mm, " + material + ", " +
                waterResistance + " up to " + resistanceDepth + "cm\n";
    }
}
