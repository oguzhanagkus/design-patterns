package Subscriber;

/**
 * This is my driver class. It has only main method.
 * It works does not get any input.
 * Only shows that some possible cases work fine.
 * Comments in the code can help you to understand.
 */
public class Demo {

    /**
     * Main method.
     * Creating some Subscribable and Subscriber objects.
     * Then calling methods of this objects, showing that they are works fine.
     * @param args default arguments, but not used
     */
    public static void main(String[] args) {
        Site TechnoBlog = new Site("TechnoBlog");
        Site ScienceBlog = new Site("ScienceBlog");
        Site MusicBlog = new Site("MusicBlog");
        Site NewsBlog = new Site("NewsBlog");

        SiteSubscriber Dave = new SiteSubscriber("Dave");
        SiteSubscriber Angel = new SiteSubscriber("Angel");
        SiteSubscriber Nicolas = new SiteSubscriber("Nicolas");

        // Testing addContentType and addSubscription methods
        Dave.addContentType(ContentType.Audio);
        Dave.addSubscription(ScienceBlog);
        Dave.addSubscription(MusicBlog);
        Dave.addSubscription(NewsBlog);

        Angel.addContentType(ContentType.Text);
        Angel.addContentType(ContentType.Photograph);
        Angel.addSubscription(ScienceBlog);
        Angel.addSubscription(NewsBlog);

        Nicolas.addContentType(ContentType.Text);
        Nicolas.addContentType(ContentType.Audio);
        Nicolas.addContentType(ContentType.Photograph);
        Nicolas.addSubscription(TechnoBlog);
        Nicolas.addSubscription(MusicBlog);

        // Show outputs of above method calls
        Angel.showDetails();
        Dave.showDetails();
        Nicolas.showDetails();
        System.out.println("----------------------------------------");

        /* ---------------------------------------- */

        // See data only interested persons get notifications from sites
        TechnoBlog.newUpdate(ContentType.Text);
        ScienceBlog.newUpdate(ContentType.Photograph);
        MusicBlog.newUpdate(ContentType.Audio);
        NewsBlog.newUpdate(ContentType.Text);
        System.out.println("----------------------------------------");

        /* ---------------------------------------- */

        // Testing removeContent method, see that the subscriber will not receive updates from uninterested source
        TechnoBlog.newUpdate(ContentType.Text);
        Nicolas.removeContentType(ContentType.Text);
        TechnoBlog.newUpdate(ContentType.Text);

        System.out.println("----------------------------------------");

        /* ---------------------------------------- */

        // Testing deleteSubscription method, see that the subscriber will not receive updates from unsubscribed source
        MusicBlog.newUpdate(ContentType.Audio);
        Dave.deleteSubscription(MusicBlog);
        MusicBlog.newUpdate(ContentType.Audio);

        System.out.println("----------------------------------------");
    }
}
