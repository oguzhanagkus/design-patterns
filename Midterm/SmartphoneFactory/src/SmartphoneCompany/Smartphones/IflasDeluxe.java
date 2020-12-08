package SmartphoneCompany.Smartphones;

import SmartphoneCompany.ComponentFactories.ComponentFactory;

/**
 * This class represents IflasDeluxe model smartphone.
 * Its constructor requires a components factory object to specify components.
 * Its base specifications are:
 *  -2.2GHz CPU + 6GB RAM
 *  -5.3 inches display
 *  -2800mAh, 20hours durable battery
 *  -32GB internal storage
 *  -5MP rear, 12MP front camera
 *  -149x73x7.7mm, aluminum, waterproof phone case
 * These specs are hard coded in class.
 */
public class IflasDeluxe extends Smartphone {
    ComponentFactory componentFactory;

    /**
     * Default constructor.
     * @param componentFactory component factory for related market
     */
    public IflasDeluxe(ComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    /**
     * Supplying components from the components factory.
     */
    @Override
    public void supplyComponents() {
        cpu = componentFactory.produceCPU(6,2.2);
        display = componentFactory.produceDisplay(5.3);
        battery = componentFactory.produceBattery(2800, 20);
        storage = componentFactory.produceStorage(32);
        camera = componentFactory.produceCamera(5,12);
        phoneCase = componentFactory.producePhoneCase(149,73,7.7, "aluminum", "waterproof");
    }
}
