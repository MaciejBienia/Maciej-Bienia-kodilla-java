package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double sideLength;
    private double height;

    public Triangle(double sideLength, double height) {
        this.sideLength = sideLength;
        this.height = height;
    }
    public double getSideLength() {
        return sideLength;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideLength, sideLength) != 0) return false;
        return Double.compare(triangle.height, height) == 0;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideLength);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }
    @Override
    public double getField() {
        return 0.5 * sideLength * height;
    }
}