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
public class Q19 {
    
    public void selectionSort2(int[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            int minIndex = i;      // Index of smallest remaining value.
            for (int j = i + 1; j < x.length; j++) {
                if (x[minIndex] > x[j]) {
                    minIndex = j;  // Remember index of new minimum
                }
            }
            if (minIndex != i) {
                //...  Exchange current element with smallest remaining.
                int temp = x[i];
                x[i] = x[minIndex];
                x[minIndex] = temp;
            }
        }
        for(int i=0; i<x.length; i++)
        {
            System.out.println(x[i]);
        }
    }
}
