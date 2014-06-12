/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks.inheritence;

/**
 *
 * @author Çağrı Çakır
 */
public class Cylinder extends Circle {

    protected double height;

// No-argument constructor
    public Cylinder() {
// implicit call to superclass constructor
        setHeight(0);
    }

// Constructor
    public Cylinder(double h, double r, int a, int b) {
        super(r, a, b);
        setHeight(h);
    }

// Set height of cylinder
    public void setHeight(double h) {
        if (h >= 0) {
            height = h;
        } else {
            height = 0;
        }
    }

// Get height of cylinder
    public double getHeight() {
        return height;
    }

// Calculate surface area of the cylinder
    public double area() {
        return 2 * super.area() + (2 * Math.PI * radius * height);
    }

// Calculate volume of Cylinder
    public double volume() {
        return super.area() * height;
    }

// Convert the cylinder to a string
    public String toString() {
        return super.toString() + "; Height = " + height;
    }
}
