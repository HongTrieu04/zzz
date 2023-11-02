package org.example;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;
    private final double a = p1.distance(p2);
    private final double b = p1.distance(p3);
    private final double c = p3.distance(p2);

    private boolean isCollinear(Point p1, Point p2, Point p3) {
        return (p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) == 0;
    }

    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
            throw new RuntimeException();
        }

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        if (isCollinear(p1, p2, p3)) {
            throw new RuntimeException();
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public String getInfo() {
        String x1 = String.format("%.2f", p1.getPointX());
        String y1 = String.format("%.2f", p1.getPointY());
        String x2 = String.format("%.2f", p2.getPointX());
        String y2 = String.format("%.2f", p2.getPointY());
        String x3 = String.format("%.2f", p3.getPointX());
        String y3 = String.format("%.2f", p3.getPointY());

        String res = "Triangle[(" + x1 + "," + y1 + ")" + ",";
        res = res + "(" + x2 + "," + y2 + ")" + ",";
        res = res + "(" + x3 + "," + y3 + ")" + "]";
        return res;
    }
}
