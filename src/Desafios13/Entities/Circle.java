package Desafios13.Entities;

import Desafios13.Entities.Enums.Color;

public class Circle extends Shape {

    private double radius;

    public Circle(){};

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }
}
