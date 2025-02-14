package com.csc205.project2;

public class Cylinder extends Shape {

        private double height;
        private double radius;

        public Cylinder() {
            this(0.0, 0.0);
        }

        public Cylinder(double height, double radius) {
            this.height = height;
            this.radius = radius;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    @Override
    public String toString() {
        return String.format("Cylinder {height=%.1f, radius=%.1f, surface area=%.16f, volume=%.16f}",
                height, radius, surfaceArea(), volume());
    }

        @Override
        public double surfaceArea() {
            return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        }

        @Override
        public double volume() {
            return Math.PI * radius * radius * height;
        }
    }

