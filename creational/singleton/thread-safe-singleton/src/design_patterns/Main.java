package design_patterns;

public class Main {
    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
    }
}
