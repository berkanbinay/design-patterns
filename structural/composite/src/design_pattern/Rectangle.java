package design_pattern;

public class Rectangle implements Shape {
    @Override
    public void fillColor(String color) {
        System.out.println("Fill Rectangle with color: "+color);
    }
}
