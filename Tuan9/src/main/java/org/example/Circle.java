package org.example;

public class Circle implements GeometricObject {
    public static final double pi = 3.14;
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }

    public String getInfo() {
        String x = String.format("%.2f", center.getPointX());
        String y = String.format("%.2f", center.getPointY());
        String r = String.format("%.2f", radius);
        String res = "Circle[(" + x + "," + y + ")";
        res = res + ",r=" + r + "]";
        return res;
    }
}
