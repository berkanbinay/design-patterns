package design_pattern;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape rectangle = new Rectangle();

        FillColor fillColorObj = new FillColor();
        fillColorObj.add(square);
        fillColorObj.add(rectangle);
        fillColorObj.fillColor("Red");

        fillColorObj.remove(rectangle);

        fillColorObj.fillColor("Blue");
    }
}
