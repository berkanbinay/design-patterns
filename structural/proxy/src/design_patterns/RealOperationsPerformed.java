package design_patterns;

public class RealOperationsPerformed implements OperationsPerformed {
    @Override
    public void view() {
        System.out.println("Performing view operation.");
    }

    @Override
    public void edit() {
        System.out.println("Performing edit operation.");
    }
}