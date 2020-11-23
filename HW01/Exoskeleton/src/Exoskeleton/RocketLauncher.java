package Exoskeleton;

/**
 * RocketLauncher class.
 */
public class RocketLauncher extends Weapon {

    /**
     * Default constructor. Its price,weight and inner component are set.
     */
    public RocketLauncher(Component component) {
        super(component);
        cost = 150000;
        weight = 7.5;
    }
}
