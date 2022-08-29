package design_pattern;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.print("Rectangle filled with color: ");
        color.fillColor();
    }
}