package SmartphoneCompany.ComponentFactories;

import SmartphoneCompany.Components.CPUs.*;
import SmartphoneCompany.Components.Displays.*;
import SmartphoneCompany.Components.Batteries.*;
import SmartphoneCompany.Components.Storages.*;
import SmartphoneCompany.Components.Cameras.*;
import SmartphoneCompany.Components.PhoneCases.*;

/**
 * This class represents a Turkey Component Factory.
 * Its instances produce smartphone components for Turkey market.
 * In Europe market,
 *  -CPUs should have 8 cores
 *  -Displays should be 32 bit
 *  -Batteries should be Lithium-Boron
 *  -Storages should support MicroSD card up to 128GB
 *  -Cameras should have x4 optical zoom
 *  -PhoneCases should be waterproof up to 200cm
 * So, this factory produces components according to these requirements.
 */
public class TurkeyComponentFactory implements ComponentFactory {
    /**
     * Create and return a OctaCoreCPU object with given specifications.
     * @param memory memory size in GB
     * @param clockSpeed clock speed in GHz
     * @return OctaCoreCPU object
     */
    @Override
    public CPU produceCPU(int memory, double clockSpeed) {
        System.out.println("Supplying CPU and RAM...");
        return new OctaCoreCPU(memory, clockSpeed);
    }

    /**
     * Create and return a 32 bit Display object with given specifications.
     * @param size screen size in inches
     * @return 32 bit Display object
     */
    @Override
    public Display produceDisplay(double size) {
        System.out.println("Supplying display...");
        return new Display32Bit(size);
    }

    /**
     * Create and return a LithiumBoron battery object with given specifications.
     * @param capacity battery capacity in mAh
     * @param duration battery duration in hours
     * @return LithiumBoron battery object
     */
    @Override
    public Battery produceBattery(int capacity, int duration) {
        System.out.println("Supplying battery...");
        return new LithiumBoron(capacity, duration);
    }

    /**
     * Create and return HighCapacity storage object which supports MicroSD cards up to 64GB with given specifications.
     * @param internal internal storage size in GB
     * @return HighCapacity storage object
     */
    @Override
    public Storage produceStorage(int internal) {
        System.out.println("Supplying storage...");
        return new HighCapacity(internal);
    }

    /**
     * Create and return Camera object with x4 digital zoom with given specifications.
     * @param rear rear camera resolution in MP
     * @param front front camera resolution in MP
     * @return Camera object with x4 optical zoom
     */
    @Override
    public Camera produceCamera(int rear, int front) {
        System.out.println("Supplying camera...");
        return new CameraZoom4x(rear, front);
    }

    /**
     * Create and return a HardCase object which is waterproof up to 100cm with given specifications.
     * @param height height in mm
     * @param width width in mm
     * @param depth depth in mm
     * @param material material of case
     * @param waterResistance water resistant or not
     * @return HardCase object
     */
    @Override
    public PhoneCase producePhoneCase(double height, double width, double depth, String material, String waterResistance) {
        System.out.println("Supplying phone case...");
        return new HardCase(height, width, depth, material, waterResistance);
    }

    /**
     * @return what editions of components
     */
    @Override
    public String toString() {
        return "Turkey Edition";
    }
}
