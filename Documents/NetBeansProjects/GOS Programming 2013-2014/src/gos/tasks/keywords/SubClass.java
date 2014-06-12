/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks.keywords;



/**
 *
 * @author Çağrı Çakır
 */
class SubClass extends SuperClass{

    SubClass() {
        this(""); // calling one arg constructor of class B
        System.out.println("Sub Class's no argument constructor");
    }
    SubClass(String args){
        super(""); // calling one argument constructor of class A
        System.out.println("SubClass's one argument constructor");
    }
    
    
}
