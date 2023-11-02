package org.example;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point other) {
        double X = pointX - other.pointX;
        double Y = pointY - other.pointY;
        return Math.sqrt(X * X + Y * Y);
    }
}
