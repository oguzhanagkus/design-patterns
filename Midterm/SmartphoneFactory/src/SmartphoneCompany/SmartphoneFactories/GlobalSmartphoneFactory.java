package SmartphoneCompany.SmartphoneFactories;

import SmartphoneCompany.Smartphones.*;
import SmartphoneCompany.ComponentFactories.*;

/**
 * This class represents a Global Smartphone Factory.
 * The production phase defined in ancestor class.
 * It only realize design phase additionally..
 */
public class GlobalSmartphoneFactory extends SmartphoneFactory {
    /**
     * Create a Smartphone object for Global Market.
     * The components will supplied from Global Component Factory.
     *
     * @param model which smartphone model will design
     * @return disassembled Smartphone object
     */
    @Override
    protected Smartphone designSmartphone(String model) {
        Smartphone smartphone;
        ComponentFactory componentFactory;

        componentFactory = new GlobalComponentFactory();

        if (model.equals("MaximumEffort")) {
            smartphone = new MaximumEffort(componentFactory);
            smartphone.setName(model + " - " + componentFactory);
        }
        else if (model.equals("IflasDeluxe")) {
            smartphone = new IflasDeluxe(componentFactory);
            smartphone.setName(model + " - " + componentFactory);
        }
        else if (model.equals("AmanIflas")) {
            smartphone = new AmanIflas(componentFactory);
            smartphone.setName(model + " - " + componentFactory);
        }
        else {
            smartphone = null;
        }

        return smartphone;
    }
}
