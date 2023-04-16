package State;

import java.util.ArrayList;

/**
 * This class implements Observable interface and represents mobese cameras.
 * It detects traffic jam and notify its observers.
 */
public class HiTech implements Observable {
    private ArrayList<Observer> observers = new ArrayList<>();
    private boolean changed;

    /**
     * Add new observer.
     * @param observer new observer object
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove observer.
     * @param observer object to remove
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notify all observers.
     * @param flag changed or not
     */
    @Override
    public void notifyObservers(boolean flag) {
        if (changed) {
            for (Observer o: observers) {
                o.update(flag);
            }
        }
        changed = false;
    }

    /**
     * Checks traffic jam.
     * @param flag changed or not
     */
    public void changeDetected(boolean flag) {
        changed = true;
        notifyObservers(flag);
    }
}
