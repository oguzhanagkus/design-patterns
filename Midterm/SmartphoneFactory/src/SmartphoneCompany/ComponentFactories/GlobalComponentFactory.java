package SmartphoneCompany.ComponentFactories;

import SmartphoneCompany.Components.CPUs.*;
import SmartphoneCompany.Components.Displays.*;
import SmartphoneCompany.Components.Batteries.*;
import SmartphoneCompany.Components.Storages.*;
import SmartphoneCompany.Components.Cameras.*;
import SmartphoneCompany.Components.PhoneCases.*;

/**
 * This class represents a Global Component Factory.
 * Its instances produce smartphone components for Global market.
 * In Global market,
 *  -CPUs should have 2 cores
 *  -Displays should be 24 bit
 *  -Batteries should be Lithium-Cobalt
 *  -Storages should support MicroSD card up to 32GB
 *  -Cameras should have x2 optical zoom
 *  -PhoneCases should be waterproof up to 50cm
 * So, this factory produces components according to these requirements.
 */
public class GlobalComponentFactory implements ComponentFactory {
    /**
     * Create and return a DualCoreCPU object with given specifications.
     * @param memory memory size in GB
     * @param clockSpeed clock speed in GHz
     * @return DualCoreCPU object
     */
    @Override
    public CPU produceCPU(int memory, double clockSpeed) {
        System.out.println("Producing CPU and RAM...");
        return new DualCoreCPU(memory, clockSpeed);
    }

    /**
     * Create and return a 24 bit Display object with given specifications.
     * @param size screen size in inches
     * @return 24 bit Display object
     */
    @Override
    public Display produceDisplay(double size) {
        System.out.println("Producing display...");
        return new Display24Bit(size);
    }

    /**
     * Create and return a LithiumCobalt battery object with given specifications.
     * @param capacity battery capacity in mAh
     * @param duration battery duration in hours
     * @return LithiumCobalt battery object
     */
    @Override
    public Battery produceBattery(int capacity, int duration) {
        System.out.println("Producing battery...");
        return new LithiumCobalt(capacity, duration);
    }

    /**
     * Create and return SmallCapacity storage object which supports MicroSD cards up to 32GB with given specifications.
     * @param internal internal storage size in GB
     * @return SmallCapacity storage object
     */
    @Override
    public Storage produceStorage(int internal) {
        System.out.println("Producing storage...");
        return new SmallCapacity(internal);
    }

    /**
     * Create and return Camera object with x2 digital zoom with given specifications.
     * @param rear rear camera resolution in MP
     * @param front front camera resolution in MP
     * @return Camera object with x2 optical zoom
     */
    @Override
    public Camera produceCamera(int rear, int front) {
        System.out.println("Producing camera...");
        return new CameraZoom2x(rear, front);
    }

    /**
     * Create and return a SimpleCase object which is waterproof up to 50cm with given specifications.
     * @param height height in mm
     * @param width width in mm
     * @param depth depth in mm
     * @param material material of case
     * @param waterResistance water resistant or not
     * @return SimpleCase object
     */
    @Override
    public PhoneCase producePhoneCase(double height, double width, double depth, String material, String waterResistance) {
        System.out.println("Producing phone case...");
        return new SimpleCase(height, width, depth, material, waterResistance);
    }

    /**
     * @return what editions of components
     */
    @Override
    public String toString() {
        return "Global Edition";
    }
}
