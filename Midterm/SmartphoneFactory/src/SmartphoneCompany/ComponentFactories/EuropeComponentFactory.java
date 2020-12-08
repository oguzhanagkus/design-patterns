package SmartphoneCompany.ComponentFactories;

import SmartphoneCompany.Components.CPUs.*;
import SmartphoneCompany.Components.Displays.*;
import SmartphoneCompany.Components.Batteries.*;
import SmartphoneCompany.Components.Storages.*;
import SmartphoneCompany.Components.Cameras.*;
import SmartphoneCompany.Components.PhoneCases.*;

/**
 * This class represents a Europe Component Factory.
 * Its instances produce smartphone components for Europe market.
 * In Europe market,
 *  -CPUs should have 4 cores
 *  -Displays should be 24 bit
 *  -Batteries should be Lithium-Ion
 *  -Storages should support MicroSD card up to 64GB
 *  -Cameras should have x3 optical zoom
 *  -PhoneCases should be waterproof up to 100cm
 * So, this factory produces components according to these requirements.
 */
public class EuropeComponentFactory implements ComponentFactory {
    /**
     * Create and return a QuadCoreCPU object with given specifications.
     * @param memory memory size in GB
     * @param clockSpeed clock speed in GHz
     * @return QuadCoreCPU object
     */
    @Override
    public CPU produceCPU(int memory, double clockSpeed) {
        System.out.println("producing CPU and RAM...");
        return new QuadCoreCPU(memory, clockSpeed);
    }

    /**
     * Create and return a 24 bit Display object with given specifications.
     * @param size screen size in inches
     * @return 24 bit Display object
     */
    @Override
    public Display produceDisplay(double size) {
        System.out.println("producing display...");
        return new Display24Bit(size);
    }

    /**
     * Create and return a LithiumIon battery object with given specifications.
     * @param capacity battery capacity in mAh
     * @param duration battery duration in hours
     * @return LithiumIon battery object
     */
    @Override
    public Battery produceBattery(int capacity, int duration) {
        System.out.println("producing battery...");
        return new LithiumIon(capacity, duration);
    }

    /**
     * Create and return MediumCapacity storage object which supports MicroSD cards up to 64GB with given specifications.
     * @param internal internal storage size in GB
     * @return MediumCapacity storage object
     */
    @Override
    public Storage produceStorage(int internal) {
        System.out.println("producing storage...");
        return new MediumCapacity(internal);
    }

    /**
     * Create and return Camera object with x3 digital zoom with given specifications.
     * @param rear rear camera resolution in MP
     * @param front front camera resolution in MP
     * @return Camera object with x3 optical zoom
     */
    @Override
    public Camera produceCamera(int rear, int front) {
        System.out.println("producing camera...");
        return new CameraZoom3x(rear, front);
    }

    /**
     * Create and return a MediumCase object which is waterproof up to 100cm with given specifications.
     * @param height height in mm
     * @param width width in mm
     * @param depth depth in mm
     * @param material material of case
     * @param waterResistance water resistant or not
     * @return MediumCase object
     */
    @Override
    public PhoneCase producePhoneCase(double height, double width, double depth, String material, String waterResistance) {
        System.out.println("producing phone case...");
        return new MediumCase(height, width, depth, material, waterResistance);
    }

    /**
     * @return what editions of components
     */
    @Override
    public String toString() {
        return "Europe Edition";
    }
}

