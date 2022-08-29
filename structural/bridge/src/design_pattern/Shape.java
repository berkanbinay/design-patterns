package design_pattern;

public abstract class Shape {
    //Composition approach
    protected Color color;

    public Shape(Color color){
        this.color=color;
    }

    abstract public void fillColor();
}
