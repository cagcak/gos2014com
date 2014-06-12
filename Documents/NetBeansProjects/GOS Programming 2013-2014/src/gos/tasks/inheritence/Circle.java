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
public class Circle extends Point {

    protected double radius;

// No argument constructor
    public Circle() {
// implicit call to superclass constructor
        setRadius(0);
    }

// Constructor
    public Circle(double r, int a, int b) {
        super(a, b);	 // call to superclass constructor
        setRadius(r);
    }

// Set radius of circle
    public void setRadius(double r) {
        if (r >= 0.0) {
            radius = r;
        } else {
            radius = 0.0;
        }
    }

// Get radius of circle
    public double getRadius() {
        return radius;
    }

// Calculate area of circle
    public double area() {
        return Math.PI * radius * radius;
    }

// Convert the circle to a string
    public String toString() {
        return "Center = " + "[" + x + ", " + y + "];" + "\nRadius = " + radius;
    }
}
