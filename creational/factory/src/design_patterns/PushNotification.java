package design_patterns;

public class PushNotification implements  INotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}
