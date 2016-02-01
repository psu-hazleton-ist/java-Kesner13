package circleGeometry;

public class Circle {
    private double radius;
    
    public Circle() {
        new Circle(0.0);
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
}