/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Çağrı Çakır
 */
public class Q13  {
    
   public void queue()
   {
       Comparator<String> comparator = new StringLengthComparator();
       PriorityQueue<String> queue = new PriorityQueue<>(10, comparator);
       queue.add("elemant 1");
       queue.add("elemant 2");
       while (queue.size() != 0) {
           System.out.println(queue.remove());
       }
   }

    private static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String x, String y) {
            if (x.length() < y.length()) {
                return -1;
            }
            if (x.length() > y.length()) {
                return 1;
            }
            return 0;
        }
    }
}