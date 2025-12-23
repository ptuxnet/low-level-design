package CreationalPatterns.Factory.SimpleFactory.NotificationExample.Solution;

// Unchanged imnplementation of EmailNotification
public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Factories don’t rewrite behavior. They just decide existence.