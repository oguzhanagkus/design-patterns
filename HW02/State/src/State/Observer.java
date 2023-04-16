package State;

/**
 * Observer interface.
 */
public interface Observer {
    /**
     * Observable objets calls update function of the observers.
     * @param flag changed or not
     */
    void update(boolean flag);
}
