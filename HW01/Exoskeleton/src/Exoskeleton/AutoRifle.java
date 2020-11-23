package Exoskeleton;

/**
 * AutoRifle class.
 */
public class AutoRifle extends Weapon {

    /**
     * Default constructor. Its price,weight and inner component are set.
     */
    public AutoRifle(Component component) {
        super(component);
        cost = 30000;
        weight = 1.5;
    }
}
