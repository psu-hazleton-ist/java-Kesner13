package circleGeometry;

import java.util.Scanner;


public class CircleDemo {
    public static void main(String[] args) {
        // Circle circle = new Circle(10.5);
        
        Scanner inputTest = new Scanner(System.in);
        
        System.out.print("input radius: ");
        double radius = inputTest.nextDouble();
        
        Circle testCircle = new Circle(radius);
        
        System.out.println("Radius is: " + testCircle.getRadius());
        System.out.println("Area is: " + testCircle.getArea());
        
    }
}