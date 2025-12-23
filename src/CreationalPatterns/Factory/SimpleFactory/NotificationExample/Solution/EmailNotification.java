package CreationalPatterns.Factory.SimpleFactory.NotificationExample.Solution;

// Unchanged imnplementation of EmailNotification
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
