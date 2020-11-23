package Exoskeleton;

/**
 * Laser class.
 */
public class Laser extends Weapon {

    /**
     * Default constructor. Its price,weight and inner component are set.
     */
    public Laser(Component component) {
        super(component);
        cost = 200000;
        weight = 5.5;
    }
}
