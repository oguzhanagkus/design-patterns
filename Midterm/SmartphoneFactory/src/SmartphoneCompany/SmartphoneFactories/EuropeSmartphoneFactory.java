package SmartphoneCompany.SmartphoneFactories;

import SmartphoneCompany.Smartphones.*;
import SmartphoneCompany.ComponentFactories.*;

/**
 * This class represents a Europe Smartphone Factory.
 * The production phase defined in ancestor class.
 * It only realize design phase additionally..
 */
public class EuropeSmartphoneFactory extends SmartphoneFactory {
    /**
     * Create a Smartphone object for Europe Market.
     * The components will supplied from Europe Component Factory.
     *
     * @param model which smartphone model will design
     * @return disassembled Smartphone object
     */
    @Override
    protected Smartphone designSmartphone(String model) {
        Smartphone smartphone;
        ComponentFactory componentFactory;

        componentFactory = new EuropeComponentFactory();

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
