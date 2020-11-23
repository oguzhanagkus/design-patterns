package Exoskeleton;

/**
 * This abstract class represents suits.
 */
public abstract class Suit extends Component {

    /**
     * Return cost of the component
     * @return cost
     */
    @Override
    public long getCost() {
        return cost;
    }

    /**
     * Return weight of the component
     * @return cost
     */
    @Override
    public double getWeight() {
        return weight;
    }
}
