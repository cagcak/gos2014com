/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

import java.util.Random;

/**
 *
 * @author Çağrı Çakır
 */
public class Q2 {
    
    static Random rand = new Random();
    static int arrayRandom[];
    static int arrayCopied[];
    
    public void initialize(){
        arrayRandom = new int[10];
        
        for ( int i=0; i < arrayRandom.length; i++ ){
            arrayRandom[i] = new Integer(rand.nextInt(10));
        }
    }
    
    public void resizeCopy(){
        arrayCopied = new int[20];
        
        for(int j=0; j<arrayRandom.length; j++){
            arrayCopied[j] = arrayRandom[j];
        }
        for(int k=10; k<arrayCopied.length; k++){
            arrayCopied[k] = arrayRandom[k-10];
        }
        for(int m=0; m<arrayCopied.length; m++){
            System.out.print(arrayCopied[m] + ",  ");
        }
    }
    
    public void resizePaste(){
        arrayRandom = new int[20];
        System.arraycopy(arrayCopied, 0, arrayRandom, 0, arrayCopied.length);
        for (int n = 0; n < arrayRandom.length; n++) {
            System.out.print(arrayRandom[n] + ",  ");
        }
    }
}
