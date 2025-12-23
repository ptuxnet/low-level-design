package CreationalPatterns.Factory.SimpleFactory.NotificationExample.Solution;

public class NotificationService {

    public void notifyUser(String type, String message) {
        Notification notification = NotificationFactory.createNotification(type);
        notification.send(message);

    }

}

// No new behavior added, no branching logic here, no existential dread.

/*
 * simple factory says:
 * only one class gets to make creation decisions. Everyone else shuts up.
 */