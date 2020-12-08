package SmartphoneCompany.Components.PhoneCases;

/**
 * This class represents a phone case which is water resistant up to 50 cm.
 */
public class SimpleCase extends PhoneCase {
    /**
     * Default constructor.
     * @param height height in mm
     * @param width width in mm
     * @param depth depth in mm
     * @param material material of phone case
     * @param waterResistance water resistant or not
     */
    public SimpleCase(double height, double width, double depth, String material, String waterResistance) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.material = material;
        this.waterResistance = waterResistance;
        this.resistanceDepth = 50;
    }
}
