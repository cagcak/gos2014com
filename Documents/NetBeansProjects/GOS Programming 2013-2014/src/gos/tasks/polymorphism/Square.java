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
public class Square extends Q9{
    
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }
    
    @Override
    public double getArea() {
        return side * side;
    }
    
    @Override
    public String toString() {
        return "side of Suare=" + side + ", subclass of " + super.toString();
    }
}
