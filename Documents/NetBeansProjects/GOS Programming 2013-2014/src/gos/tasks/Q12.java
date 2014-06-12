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
public class Q12 {
    
    private String stringA = "I am a String";
    private String stringB = "I am a String";
    
    public boolean compareString(){
        return stringA.equals(stringB);
    }
    
    public void splitString()
    {
        if(compareString()){
            String[] items = stringA.split(" ");
            for (String item : items) {
                System.out.println(item);
            }
        }
    }
    
}
