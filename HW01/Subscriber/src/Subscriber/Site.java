package Subscriber;

import java.util.HashSet;

/**
 * This class implements Subscribable interface and represents a site.
 * A site must have a name.
 * A site have multiple unique subscribers. They can be subscribe or unsubscribe any time.
 * Subscribers stored as set. Its reason is that to avoiding duplicate objects.
 */
public class Site implements Subscribable {
    private boolean changed;
    private final String name;
    private final HashSet<Subscriber> subscribers = new HashSet<>();

    /**
     * Constructor gets and sets site's name.
     * @param name name
     */
    public Site(String name) {
        this.name = name;
        this.changed = false;
    }

    /**
     * Returns name of the site.
     * @return name of the site
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Adds a new subscriber for the site.
     * @param subscriber subscriber
     */
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    /**
     * Remove given subscriber from subscriber list
     * @param subscriber subscriber
     */
    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    /**
     * Notify all subscribers who are interested in content type of the update.
     * @param contentType content type
     */
    @Override
    public void notifySubscribers(ContentType contentType) {
        if (changed) {
            for (Subscriber s: subscribers) {
                if (s.isInterested(contentType)) {
                    s.update(this, "Here is a new " + contentType.toString().toLowerCase() + " for you!");
                }
            }
        }
        changed = false;
    }

    /**
     * Set status changed.
     */
    @Override
    public void setChanged() {
        changed = true;
    }

    /**
     * This method represents a new update with a content type. It calls notifySubscribers method.
     * @param contentType content type
     */
    public void newUpdate(ContentType contentType) {
        setChanged();
        notifySubscribers(contentType);
    }
}
