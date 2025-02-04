package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;
import edu.cmu.cs.cs214.lab02.Renderer;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(5);
        Shape circle = new Circle(6);

        Renderer rectangleRenderer = new Renderer(rectangle);
        Renderer squareRenderer = new Renderer(square);
        Renderer circleRenderer = new Renderer(circle);

        rectangleRenderer.draw();
        squareRenderer.draw();
        circleRenderer.draw();
    }
}
