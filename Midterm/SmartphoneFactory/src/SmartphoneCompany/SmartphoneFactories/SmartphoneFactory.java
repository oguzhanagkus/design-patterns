package SmartphoneCompany.SmartphoneFactories;

import SmartphoneCompany.Smartphones.Smartphone;

/**
 * This abstract class represents a Smartphone factory.
 * It has two methods.
 * Production phase have standard instructions. So, it is concrete method.
 * Design phase can change according model and target market. So, it is abstract.
 * The subclasses must define design phase.
 */
public abstract class SmartphoneFactory {
    /**
     * Define production phase.
     * Firstly, design smartphone. Decide which components will used.
     * Then, supply these components from the component factory.
     * Finally, combine components.
     *
     * @param model what model will produce
     * @return Smartphone object
     */
    public Smartphone produce(String model) {
        Smartphone smartphone;

        System.out.println("Designing smartphone...");
        smartphone = designSmartphone(model);
        System.out.println("Smartphone design completed.");
        System.out.println("Supplying components...");
        smartphone.supplyComponents();
        System.out.println("Components supplied.");
        System.out.println("Production starting...");
        smartphone.attachCPU();
        smartphone.attachDisplay();
        smartphone.attachBattery();
        smartphone.attachStorage();
        smartphone.attachCamera();
        smartphone.enclosePhoneCase();
        System.out.println("Production completed.\n");

        return smartphone;
    }

    /**
     * Decide the smartphone components.
     * @param model which smartphone model will design
     * @return disassembled Smartphone object
     */
    protected abstract Smartphone designSmartphone(String model);
}