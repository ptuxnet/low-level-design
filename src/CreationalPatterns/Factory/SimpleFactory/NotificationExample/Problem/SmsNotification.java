package CreationalPatterns.Factory.SimpleFactory.NotificationExample.Problem;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// The chaos is about to begin.