package SmartphoneCompany;

import SmartphoneCompany.Smartphones.Smartphone;
import SmartphoneCompany.SmartphoneFactories.*;

/**
 * This is my driver class.
 * It show that how the whole system work.
 * It creates 3 factory: Turkey, Europe and Global
 * Each factory produce 3 model: MaximumEffort, IflasDeluxe, AmanIflas
 */
public class Demo {
    /**
     * Main method.
     * @param args command line arguments ignored
     */
    public static void main(String[] args) {
        SmartphoneFactory TurkeyFactory, EuropeFactory, GlobalFactory;
        Smartphone smartphone;

        TurkeyFactory = new TurkeySmartphoneFactory();
        smartphone = TurkeyFactory.produce("MaximumEffort");
        System.out.println(smartphone + "\n--------------------------------------------------\n");
        smartphone = TurkeyFactory.produce("IflasDeluxe");
        System.out.println(smartphone + "\n--------------------------------------------------\n");
        smartphone = TurkeyFactory.produce("AmanIflas");
        System.out.println(smartphone + "\n--------------------------------------------------\n");

        EuropeFactory = new EuropeSmartphoneFactory();
        smartphone = EuropeFactory.produce("MaximumEffort");
        System.out.println(smartphone + "\n--------------------------------------------------\n");
        smartphone = EuropeFactory.produce("IflasDeluxe");
        System.out.println(smartphone + "\n--------------------------------------------------\n");
        smartphone = EuropeFactory.produce("AmanIflas");
        System.out.println(smartphone + "\n--------------------------------------------------\n");

        GlobalFactory = new GlobalSmartphoneFactory();
        smartphone = GlobalFactory.produce("MaximumEffort");
        System.out.println(smartphone + "\n--------------------------------------------------\n");
        smartphone = GlobalFactory.produce("IflasDeluxe");
        System.out.println(smartphone + "\n--------------------------------------------------\n");
        smartphone = GlobalFactory.produce("AmanIflas");
        System.out.println(smartphone + "\n--------------------------------------------------\n");
    }
}
