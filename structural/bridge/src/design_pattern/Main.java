package design_pattern;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new BlueColor());
        circle.fillColor();

        Shape rectangle = new Rectangle(new GreenColor());
        rectangle.fillColor();
    }
}
