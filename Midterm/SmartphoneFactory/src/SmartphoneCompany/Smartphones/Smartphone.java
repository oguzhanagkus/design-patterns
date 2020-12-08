package SmartphoneCompany.Smartphones;

import SmartphoneCompany.Components.CPUs.CPU;
import SmartphoneCompany.Components.Displays.Display;
import SmartphoneCompany.Components.Batteries.Battery;
import SmartphoneCompany.Components.Storages.Storage;
import SmartphoneCompany.Components.Cameras.Camera;
import SmartphoneCompany.Components.PhoneCases.PhoneCase;

/**
 * This abstract class represents a smartphone.
 * A smartphone consist of certain components: CPU, Display, Battery, Storage, Camera, PhoneCase.
 * After supplying all components for a smartphone, each component should be attached.
 *
 * Supplying phase differs phone to phone and market to market. So, that method is abstract.
 * But attaching operations is certain.
 */
public abstract class Smartphone {
    String name;
    CPU cpu;
    Display display;
    Battery battery;
    Storage storage;
    Camera camera;
    PhoneCase phoneCase;

    /**
     * Supply components for the smartphone from a component factory.
     */
    public abstract void supplyComponents();

    /**
     * Attaching CPU and RAM.
     */
    public void attachCPU() {
        System.out.println("Attaching CPU and RAM...");
    }

    /**
     * Attaching Display.
     */
    public void attachDisplay() {
        System.out.println("Attaching display...");
    }

    /**
     * Attaching battery.
     */
    public void attachBattery() {
        System.out.println("Attaching battery...");
    }

    /**
     * Attaching storage.
     */
    public void attachStorage() {
        System.out.println("Attaching storage...");
    }

    /**
     * Attaching camera.
     */
    public void attachCamera() {
        System.out.println("Attaching camera...");
    }

    /**
     * Enclosing phone case.
     */
    public void enclosePhoneCase() {
        System.out.println("Enclosing phone case...");
    }

    /**
     * Set name of the smartphone
     * @param name name of the smartphone
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Specifications of the smartphone
     */
    @Override
    public String toString() {
        return "Smartphone specs:\nName -> " + name + "\n" + cpu + display + battery + storage + camera + phoneCase;
    }
}