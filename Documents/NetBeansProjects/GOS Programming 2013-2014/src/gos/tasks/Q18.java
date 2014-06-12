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
public class Q18 {
    
    public void reachInnerClass()
    {
        InnerClass ref = new InnerClass();
        ref.getClass();
    }
    
    private static class InnerClass
    {
        public InnerClass() {
            System.out.println("I am a inner class");
        }
    }
    
}
