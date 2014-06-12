/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

/**
 *
 * @author Çağrı Çakır
 */
public class Q9 {

    private String color;
    
    public Q9(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Shape of color=\"" + color + "\"";
    }
    
    public double getArea() {
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;   // Need a return to compile the program
    }

    
}
