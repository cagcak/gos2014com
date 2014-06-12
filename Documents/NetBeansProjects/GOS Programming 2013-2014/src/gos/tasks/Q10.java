/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

import java.util.Stack;

/**
 *
 * @author Çağrı Çakır
 */
public class Q10 {
    
    public void reverseWordStack()
    {
        String word = "reverse stack";
        Stack<Character> chStack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            chStack.push(word.charAt(i));
        }

        String out = "";
        while (chStack.size() != 0) {
            out += chStack.pop();
        }
        System.out.println(out);
    }
    
}
