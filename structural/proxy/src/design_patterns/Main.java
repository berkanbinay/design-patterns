package design_patterns;

public class Main {
    public static void main(String[] args) {
        OperationsPerformed operationsPerformed = new ProxyOperationsPerformed("jai");
        operationsPerformed.view();
        operationsPerformed.edit();
    }
}
