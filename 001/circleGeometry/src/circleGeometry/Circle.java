package circleGeometry;

public class Circle {
    private double radius;
    private static double PI = 3.14;
    
    public Circle() {
        new Circle(0.0);
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
        
    public double getArea() {
        return PI * this.radius * this.radius;
    }
}