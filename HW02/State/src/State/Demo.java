package State;

/**
 * This class is driver.
 */
public class Demo {
    /**
     * Main method.
     * @param args ignored
     */
    public static void main(String[] args) {
        //HiTech is observable, TrafficLight is observer
        HiTech mobese = new HiTech();
        TrafficLight trafficLight = new TrafficLight();

        // Add observer
        mobese.addObserver(trafficLight);

        // Run traffic lights
        trafficLight.turnOnGreen();
        trafficLight.turnOnYellow();
        trafficLight.turnOnRed();

        // High traffic detected
        mobese.changeDetected(true);
        trafficLight.turnOnGreen();
        trafficLight.turnOnYellow();
        trafficLight.turnOnRed();

        // Normal traffic
        mobese.changeDetected(false);
        trafficLight.turnOnGreen();
        trafficLight.turnOnYellow();
        trafficLight.turnOnRed();
    }
}
