package Exoskeleton;

/**
 * This abstract class represents weapons.
 * Each weapon has inner component which can be a suit or weaponized suit.
 */
public abstract class Weapon extends Component {
    Component component;

    /**
     * Constructor
     * @param component single suit or weaponized suit
     */
    public Weapon(Component component) {
        this.component = component;
    }

    /**
     * Return weight of the component
     * @return cost + inner component cost
     */
    @Override
    public long getCost() {
        return component.getCost() + cost;
    }

    /**
     * Return weight of the component
     * @return cost + inner component weight
     */
    @Override
    public double getWeight() {
        return component.getWeight() + weight;
    }
}
