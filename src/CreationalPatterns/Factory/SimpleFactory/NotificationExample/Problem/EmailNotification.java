package CreationalPatterns.Factory.SimpleFactory.NotificationExample.Problem;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification with message: " + message);
    }

}

// Still clean. The disaster hasn’t arrived yet.
