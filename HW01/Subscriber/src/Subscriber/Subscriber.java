package Subscriber;

/**
 * This is an interface that represents a subscriber.
 * A subscriber have specific properties, it means that it must implement methods below.
 * It is up to you how to store interests and subscriptions.
 */
public interface Subscriber {

    /**
     * Add new interest for subscriber.
     * When a content type added, the subscriber gets this kind of updates from its subscriptions.
     * @param contentType content type
     */
    void addContentType(ContentType contentType);

    /**
     * Remove a content type from interest list.
     * When a content type removed, the subscriber will not get this kind of updates from its subscriptions.
     * @param contentType content type
     */
    void removeContentType(ContentType contentType);

    /**
     * Checks this subscriber interested this kind of content
     * @param contentType content type
     * @return true if interested, false otherwise
     */
    boolean isInterested(ContentType contentType);

    /**
     * Add a new subscription. Subscriber will get updates from this source if it interested in content type of update.
     * @param subscribable site
     */
    void addSubscription(Subscribable subscribable);

    /**
     * Remove given source from subscription list. Subscriber will not receive any update from this source.
     * @param subscribable site
     */
    void deleteSubscription(Subscribable subscribable);

    /**
     * The subscription source calls this method to notify subscribers.
     * @param sender which source sent this update
     * @param message what message the source sent
     */
    void update(Subscribable sender, String message);
}
