/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

import java.util.Scanner;

/**
 *
 * @author Çağrı Çakır
 */
public class Q3 {
    
    
    private static int fibonacci(int number)
    {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) 
        {
            fibonacci = fibo1 + fibo2; 
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        
        return fibonacci;
    }
    
    private static int fibonacciRecursion(int number) 
    {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    
    public void firstN()
    {
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }
    
}
