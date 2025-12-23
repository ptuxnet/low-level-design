package CreationalPatterns.Factory.SimpleFactory.NotificationExample.Solution;

public class WhatsAppNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp message: " + message);
    }

    // Additional methods or properties can be added here if needed
}
// WhatsAppNotification class implementing Notification interface