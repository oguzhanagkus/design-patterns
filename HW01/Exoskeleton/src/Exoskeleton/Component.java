package Exoskeleton;

/**
 * This abstract class represents components.
 * Each component has a cost and weight.
 * A component can be single or composed.
 */
public abstract class Component {
    long cost;
    double weight;

    /**
     * Return cost of the component
     * @return cost
     */
    public abstract long getCost();

    /**
     * Return weight of the component
     * @return cost
     */
    public abstract double getWeight();
}
