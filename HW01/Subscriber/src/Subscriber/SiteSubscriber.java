package Subscriber;

import java.util.HashSet;

/**
 * This class implements Subscriber interface and represents a site subscriber.
 * A subscriber must have a username.
 * A subscriber can interests some content types. It is possible to add or remove content type.
 * A subscriber can subscribe multiple sites.
 * Both interest and subscriptions are stored as set. Its reason is that to avoiding duplicate objects.
 */
public class SiteSubscriber implements Subscriber {
    private final String username;
    private final HashSet<ContentType> interests = new HashSet<>();
    private final HashSet<Subscribable> subscriptions = new HashSet<>();

    /**
     * Constructor gets and sets only username. The interests and content types are empty.
     * They are should be added manually with methods below.
     * @param username username of site subscriber
     */
    public SiteSubscriber(String username) {
        this.username = username;
    }

    /**
     * Add new interest for subscriber.
     * When a content type added, the subscriber gets this kind of updates from its subscriptions.
     * @param contentType content type
     */
    public void addContentType(ContentType contentType) {
        interests.add(contentType);
    }

    /**
     * Remove a content type from interest list.
     * When a content type removed, the subscriber will not get this kind of updates from its subscriptions.
     * @param contentType content type
     */
    public void removeContentType(ContentType contentType) {
        interests.remove(contentType);
    }

    /**
     * Checks this subscriber interested this kind of content
     * @param contentType content type
     * @return true if interested, false otherwise
     */
    public boolean isInterested(ContentType contentType) {
        return interests.contains(contentType);
    }

    /**
     * Add a new subscription. Subscriber will get updates from this source if it interested in content type of update.
     * @param subscribable site
     */
    public void addSubscription(Subscribable subscribable) {
        subscriptions.add(subscribable);
        subscribable.addSubscriber(this);
    }

    /**
     * Remove given source from subscription list. Subscriber will not receive any update from this source.
     * @param subscribable site
     */
    public void deleteSubscription(Subscribable subscribable) {
        subscriptions.remove(subscribable);
        subscribable.removeSubscriber(this);
    }

    /**
     * The subscription source calls this method to notify subscribers.
     * @param sender which source sent this update
     * @param message what message the source sent
     */
    public void update(Subscribable sender, String message) {
        if (sender instanceof Site) {
            System.out.println(username + ": New update from " + sender.getName() + ". Message: " + message);
        }
    }

    /**
     * Shows that interests and subscriptions of the subscriber.
     */
    public void showDetails() {
        System.out.println("Interests of " + username + ": " + interests);
        System.out.print("Subscriptions of " + username + ": [");
        for (Subscribable s: subscriptions) {
            System.out.print(s.getName() + ", ");
        }
        System.out.println("\b\b]");
    }
}
