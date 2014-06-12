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
public class Triangle extends Q9{
    
    private int base;
    private int height;

    // Constructor
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle of base=" + base + " and height=" + height + ", subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    
}
