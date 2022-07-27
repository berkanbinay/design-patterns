package design_patterns;

public class EmailNotification implements INotification{

    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
}
