package design_patterns;

public class SMSNotification implements INotification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
