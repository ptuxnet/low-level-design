package CreationalPatterns.Factory.SimpleFactory.NotificationExample.Solution;

public class NotificationFactory {

    public static Notification createNotification(String type) {

        if (type.equals("Emai")) {
            return new EmailNotification();
        }

        if (type.equals("Sms")) {
            return new SmsNotification();
        }

        if (type.equals("WhatsApp")) {
            return new WhatsAppNotification();
        }

        throw new IllegalArgumentException("Unknown notification type: " + type);

    }

}

// All creation logic lives here.
// One place. One mess. Contained.