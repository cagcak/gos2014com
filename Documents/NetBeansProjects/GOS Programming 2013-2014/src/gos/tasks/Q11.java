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
public class Q11 {

    public void namespace() {
        System.out.println("Some languages, like Java, don't have global variables. In Java, all variables that are not local variables are fields of a class. Hence all variables are in the scope of either a class or a method. In Java, static fields (aka class variables) exist independently of any instances of the class and one copy is shared among all instances; hence public static fields are used for many of the same purposes as global variables in other languages because of their similar \"sharing\" behavior.");
        System.out.println("c++ uses namespace to group related functions and classes and to avoid variable name conflict.");
        System.out.println("java uses package to group related classes since everything in java is inside a class.");
        
        System.out.println();
        System.out.println("in this example its like a namespace inside a namespace\n");
        Q11 o = new Q11();
        System.out.println("package " + o.getClass().getPackage().getName() + ";");
        System.out.println("class " + this.getClass().getCanonicalName() + "{\n}");
    }

}
