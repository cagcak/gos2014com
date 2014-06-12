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
public class Point {

        protected int x, y;

// No argument constructor
        public Point() {
// implicit call to superclass constructor occurs here
            setPoint(0, 0);
        }

// Constructor
        public Point(int a, int b) {
// implicit call to superclass constructor occurs here
            setPoint(a, b);
        }

// Set the x and y coordinates of Point
        public void setPoint(int a, int b) {
            x = a;
            y = b;
        }

// get x coordinate
        public int getX() {
            return x;
        }

// get y coordinate
        public int getY() {
            return y;
        }

// convert the point into a String representation
        public String toString() {
            return "[" + x + ", " + y + "]";
        }
}