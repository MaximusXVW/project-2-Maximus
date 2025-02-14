package com.csc205.project2;

public class Cube extends Shape {

        private double width;

        public Cube() {
            this(0.0);
        }

        public Cube(double width) {
            this.width = width;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

    @Override
    public String toString() {
        return String.format("Cube {width=%.2f, surface area=%.2f, volume=%.2f}",
                width, surfaceArea(), volume());
    }


        @Override
        public double surfaceArea() {
            return 6 * width * width;
        }

        @Override
        public double volume() {
            return width * width * width;
        }
    }

