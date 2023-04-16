package Iterator;

/**
 * Interface for possible iterator classes.
 */
public interface GokturkIterator {
    /**
     * Check it has next element
     * @return has next element or not
     */
    boolean hasNext();

    /**
     * Return next item.
     * @return next item
     */
    Object next();
}