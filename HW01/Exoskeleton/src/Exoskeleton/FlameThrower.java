package Exoskeleton;

/**
 * FlameThrower class.
 */
public class FlameThrower extends Weapon {

    /**
     * Default constructor. Its price,weight and inner component are set.
     */
    public FlameThrower(Component component) {
        super(component);
        cost = 50000;
        weight = 2;
    }
}
