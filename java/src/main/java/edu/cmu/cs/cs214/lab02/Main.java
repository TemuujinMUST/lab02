package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(4);
        Shape circle = new Circle(5);

        printShape(rectangle);
        printShape(square);
        printShape(circle);
    }

    public static void printShape(Shape shape) {
        System.out.println("Shape printed\n" + "The area of " + shape.getShapeName() + " is " + shape.getArea());
    }
}
