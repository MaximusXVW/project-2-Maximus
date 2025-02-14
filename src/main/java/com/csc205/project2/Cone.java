package com.csc205.project2;

public class Cone extends Shape {


        private double height;
        private double radius;

        public Cone() {
        this(0.0, 0.0);
    }

        public Cone( double height, double radius){
        this.height = height;
        this.radius = radius;
    }

        public double getHeight () {
        return height;
    }

        public void setHeight ( double height){
        this.height = height;
    }

        public double getRadius () {
        return radius;
    }

        public void setRadius ( double radius){
        this.radius = radius;
    }

        @Override
        public double surfaceArea () {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

        @Override
        public double volume () {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
    }




