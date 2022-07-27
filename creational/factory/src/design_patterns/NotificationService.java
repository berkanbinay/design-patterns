package design_patterns;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        INotification iNotification = notificationFactory.createNotification("SMS");
        iNotification.notifyUser();
    }
}
