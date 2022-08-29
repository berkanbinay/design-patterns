package design_pattern;

public class Square implements Shape {
    @Override
    public void fillColor(String color) {
        System.out.println("Fill Square with color: "+color);
    }
}