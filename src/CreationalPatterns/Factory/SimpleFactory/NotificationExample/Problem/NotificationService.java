package CreationalPatterns.Factory.SimpleFactory.NotificationExample.Problem;

public class NotificationService {
    public void notifyUser(String type, String message) {
        Notification notification;

        if (type.equals("EMAIL")) {
            notification = new EmailNotification();

        } else if (type.equals("SMS")) {
            notification = new SmsNotification();
        } else {
            throw new IllegalArgumentException("Unknown notification type");
        }

        notification.send(message);

    }
}

/*

Let's count sins:

1. Tight Coupling: The NotificationService is tightly coupled to specific notification types (EmailNotification and SmsNotification). This makes it hard to add new notification types without modifying the existing code.
2. Violation of Open/Closed Principle: The class is not closed for modification. Every time a new notification type is added, the notifyUser method must be changed, violating the Open/Closed Principle of SOLID design principles.
3. logic duplication: If there were more notification types, the if-else structure would grow, leading to duplicated logic for creating and sending notifications.
4. Testing pain: Testing this class in isolation becomes difficult because it directly instantiates concrete notification classes. This makes unit testing and mocking more challenging.


*/