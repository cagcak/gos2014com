/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

import gos.tasks.inheritence.Circle;
import gos.tasks.inheritence.Cylinder;
import gos.tasks.inheritence.Point;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Çağrı Çakır
 */
public class Q7 {
    
    public void testPoint()
    {
        Point point = new Point(72, 115);
        String out = "X coordinate is " + point.getX()
                + "\nY coordinate is " + point.getY();
        point.setPoint(10, 10);

        out = out + "\n\nThe new location of p is " + point;

        JOptionPane.showMessageDialog(null, out, "Demonstrating Class Point", JOptionPane.INFORMATION_MESSAGE);

//        System.exit(0);
    }
    
    public void testCircle()
    {
        Circle c = new Circle(2.5, 37, 43);
        DecimalFormat precision2 = new DecimalFormat("0.00");
        String output;

        output = "X coordinate is " + c.getX()
                + "\nY coordinate is " + c.getY()
                + "\nRadius is " + c.getRadius();

        c.setRadius(4.25);
        c.setPoint(2, 2);
// Implicit call to toString()
        output = output + "\n\nThe new location and radius of c are|n" + c
                + "\nArea is " + precision2.format(c.area());

        JOptionPane.showMessageDialog(null, output, "Demonstrating Class Circle",
                JOptionPane.INFORMATION_MESSAGE);

//        System.exit(0);
    }
    
    public void testCylinder()
    {
        Cylinder c = new Cylinder(5.7, 2.5, 12, 23);
        DecimalFormat precision2 = new DecimalFormat("0.00");
        String output;

        output = "X coordinate is " + c.getX()
                + "\nY coordinate is " + c.getY()
                + "\nRadius is " + c.getRadius()
                + "\nHeight is " + c.getHeight();

        c.setHeight(10);
        c.setRadius(4.25);
        c.setPoint(2, 2);

        output = output + "\n\nThe new location, radius and height of c are\n" + c
                + "\nArea is " + precision2.format(c.area())
                + "\nVolume is " + precision2.format(c.volume());

        
        JOptionPane.showMessageDialog(null, output, "Demonstrating Class Cylinder",
                JOptionPane.INFORMATION_MESSAGE);
        

//        System.exit(0);
    }
}
