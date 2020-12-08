package SmartphoneCompany.ComponentFactories;

import SmartphoneCompany.Components.CPUs.CPU;
import SmartphoneCompany.Components.Displays.Display;
import SmartphoneCompany.Components.Batteries.Battery;
import SmartphoneCompany.Components.Storages.Storage;
import SmartphoneCompany.Components.Cameras.Camera;
import SmartphoneCompany.Components.PhoneCases.PhoneCase;

/**
 * This interface represents a Component Factory.
 * Its concrete instances produce smartphone components according to given specifications.
 * Smartphones are consist of certain components.
 * So, each Component factory must have producer method for each component.
 */
public interface ComponentFactory {
    /**
     * Create and return a CPU (it also includes RAM) object with given specifications.
     * @param memory memory size in GB
     * @param clockSpeed clock speed in GHz
     * @return CPU object
     */
    CPU produceCPU(int memory, double clockSpeed);

    /**
     * Create and return a Display object with given specifications.
     * @param size screen size in inches
     * @return Display object
     */
    Display produceDisplay(double size);

    /**
     * Create and return a Battery object with given specifications.
     * @param capacity battery capacity in mAh
     * @param duration battery duration in hours
     * @return Battery object
     */
    Battery produceBattery(int capacity, int duration);

    /**
     * Create and return a Storage object with given specifications.
     * @param internal internal storage size in GB
     * @return Storage object
     */
    Storage produceStorage(int internal);

    /**
     * Create and return a Camera object with given specifications.
     * @param rear rear camera resolution in MP
     * @param front front camera resolution in MP
     * @return Camera object
     */
    Camera produceCamera(int rear, int front);

    /**
     * Create and return a Phone case object with given specifications.
     * @param height height in mm
     * @param width width in mm
     * @param depth depth in mm
     * @param material material of case
     * @param waterResistance water resistant or not
     * @return PhoneCase object
     */
    PhoneCase producePhoneCase(double height, double width, double depth, String material, String waterResistance);
}
