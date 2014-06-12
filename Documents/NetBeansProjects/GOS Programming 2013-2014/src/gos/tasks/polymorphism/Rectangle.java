/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks.polymorphism;

import gos.tasks.Q9;

/**
 *
 * @author Çağrı Çakır
 */
public class Rectangle extends Q9{
    
    // Private member variables
    private int length;
    private int width;

    // Constructor
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle of length=" + length + " and width=" + width + ", subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return length * width;
    }
    
}
