package SmartphoneCompany.Smartphones;

import SmartphoneCompany.ComponentFactories.ComponentFactory;

/**
 * This class represents AmanIflas model smartphone.
 * Its constructor requires a components factory object to specify components.
 * Its base specifications are:
 *  -2.8GHz CPU + 8GB RAM
 *  -5.5 inches display
 *  -3600mAh, 27hours durable battery
 *  -64GB internal storage
 *  -8MP rear, 12MP front camera
 *  -151x73x7.7mm, aluminum, waterproof phone case
 * These specs are hard coded in class.
 */
public class MaximumEffort extends Smartphone {
    ComponentFactory componentFactory;

    /**
     * Default constructor.
     * @param componentFactory component factory for related market
     */
    public MaximumEffort(ComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    /**
     * Supplying components from the components factory.
     */
    @Override
    public void supplyComponents() {
        cpu = componentFactory.produceCPU(8,2.8);
        display = componentFactory.produceDisplay(5.5);
        battery = componentFactory.produceBattery(3600, 27);
        storage = componentFactory.produceStorage(64);
        camera = componentFactory.produceCamera(12,8);
        phoneCase = componentFactory.producePhoneCase(151,73,7.7, "aluminum", "waterproof");
    }
}
