package com.csc205.project2;

public class Shape implements ThreeDimensionalShape {

    @Override
    public double surfaceArea() {
        return 0; // Default implementation (can be overridden)
    }

    @Override
    public double volume() {
        return 0; // Default implementation (can be overridden)
    }

    @Override
    public String toString() {
        return String.format("%s {surface area=%.16f, volume=%.16f}", // 16 decimal places
                this.getClass().getSimpleName(), surfaceArea(), volume());
    }
}
