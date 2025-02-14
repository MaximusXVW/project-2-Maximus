package com.csc205.project2;

public class Sphere extends Shape {
    private double radius;

    public Sphere() {
        this(0.0);
    }

    public Sphere(double v) {
        this.radius = v;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {  // Modified toString() for exact match
        return String.format("Sphere {radius=%.1f, surface area=%.16f, volume=%.16f}",
                radius, surfaceArea(), volume());
    }
}