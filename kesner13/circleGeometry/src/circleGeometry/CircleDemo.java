package circleGeometry;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(10.5);
        
        double radius = circle.getRadius();
        
        System.out.println("Radius is: " + radius);
    }
}