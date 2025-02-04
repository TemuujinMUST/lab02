package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private final Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();
        String name = shape.getName();
        System.out.println("Shape printed\n" + name + " area is: " + area);
    }
}
