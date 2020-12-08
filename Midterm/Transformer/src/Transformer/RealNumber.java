package Transformer;

/**
 * This class represents real numbers. It has a value field.
 */
public class RealNumber implements Number {
    double value;

    /**
     * Default constructor.
     */
    public RealNumber() {
        this.value = 0;
    }

    /**
     * Constructor with initial value
     * @param value initial value
     */
    public RealNumber(double value) {
        this.value = value;
    }

    /**
     * Set a new value.
     * @param value new value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Get current value.
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * @return value
     */
    @Override
    public String toString() {
        return String.format("%.3f", value);
    }
}
