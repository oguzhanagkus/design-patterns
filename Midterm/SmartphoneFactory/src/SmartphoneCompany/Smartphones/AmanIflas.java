package SmartphoneCompany.Smartphones;

import SmartphoneCompany.ComponentFactories.ComponentFactory;

/**
 * This class represents AmanIflas model smartphone.
 * Its constructor requires a components factory object to specify components.
 * Its base specifications are:
 *  -2.2GHz CPU + 4GB RAM
 *  -4.5 inches display
 *  -2000mAh, 16hours durable battery
 *  -16GB internal storage
 *  -5MP rear, 8MP front camera
 *  -143x69x7.3mm, plastic, waterproof phone case
 * These specs are hard coded in class.
 */
public class AmanIflas extends Smartphone {
    ComponentFactory componentFactory;

    /**
     * Default constructor.
     * @param componentFactory component factory for related market
     */
    public AmanIflas(ComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    /**
     * Supplying components from the components factory.
     */
    @Override
    public void supplyComponents() {
        cpu = componentFactory.produceCPU(4,2.2);
        display = componentFactory.produceDisplay(4.5);
        battery = componentFactory.produceBattery(2000, 16);
        storage = componentFactory.produceStorage(16);
        camera = componentFactory.produceCamera(8,5);
        phoneCase = componentFactory.producePhoneCase(143,69,7.3, "plastic", "waterproof");
    }
}
