package com.company;

public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape == "Circle") {
            return new Circle();
        }
        if (shape == "Rectangle") {
            return new Rectangle();
        }
        return null;
    }
}
