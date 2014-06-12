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
public class Q8 {

    public void run() {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Figure figref;
        figref = f;
        System.out.println("Area is :" + figref.area());
        figref = r;
        System.out.println("Area is :" + figref.area());
    }
}

class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    Double area() {
        System.out.println("Inside area for figure.");
        return (dim1 * dim2);
    }
}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    Double area() {
        System.out.println("Inside area for rectangle.");
        return (dim1 * dim2);
    }
}
