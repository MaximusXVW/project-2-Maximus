package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {
        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(5.0);
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        Cone cone = new Cone(6.0, 2.5);

        System.out.println(sphere);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(cone);
        cube.setWidth(6.0);
        cylinder.setHeight(5.0);

    }
}





