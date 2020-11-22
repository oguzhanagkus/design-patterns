package Subscriber;

/**
 * This is an interface that represents a subscribable stuff. It can be an website.
 * This kind of things have specific properties, it means that it must implement methods below.
 * It is up to you how to store subscribers.
 */
public interface Subscribable {

    /**
     * Each object must have a name. This method returns its name.
     * @return name of object
     */
    String getName();

    /**
     * Adds new subscriber.
     * @param subscriber subscriber
     */
    void addSubscriber(Subscriber subscriber);

    /**
     * Remove a subscriber from list
     * @param subscriber subscriber
     */
    void removeSubscriber(Subscriber subscriber);

    /**
     * Notify its subscribers
     * @param contentType content type
     */
    void notifySubscribers(ContentType contentType);

    /**
     * Set status changed.
     */
    void setChanged();
}
