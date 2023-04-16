package State;

/**
 * Observable interface.
 */
public interface Observable {
    /**
     * Add new observer.
     * @param observer new observer object
     */
    void addObserver(Observer observer);

    /**
     * Remove observer.
     * @param observer object to remove
     */
    void removeObserver(Observer observer);

    /**
     * Notify all observers.
     * @param flag changed or not
     */
    void notifyObservers(boolean flag);
}
