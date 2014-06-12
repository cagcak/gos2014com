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
public class Q21 {
    
    private Runnable r1;
    private Runnable r2;
    
    public void configureThreads()
    {
        r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("Hello, world!");
                        Thread.sleep(1000L);
                    }
                } catch (InterruptedException iex) {
                }
            }
        };
        r2 = new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("Goodbye, " + "cruel world!");
                        Thread.sleep(2000L);
                    }
                } catch (InterruptedException iex) {
                }
            }
        };
    }
    
    public void runThreads()
    {
        Thread thr1 = new Thread(r1);
        Thread thr2 = new Thread(r2);
        thr1.start();
        thr2.start();
    }
    
}
