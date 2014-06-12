/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

import gos.test.TestAllCodeSnippets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Çağrı Çakır
 */
public class Q5 {
    
    private static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }

        return fibonacci;
    }

    private static int fibonacciRecursion(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public void firstN() {
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        try {
            String PATH = TestAllCodeSnippets.folder;
            File file = new File(PATH, "fibo.txt");
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            int[] arrayFibo = new int[number];
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 1; i <= number; i++) {
                arrayFibo[i-1] = fibonacciRecursion(i);
                System.out.print(fibonacciRecursion(i) + " ");
                bw.write(arrayFibo[i-1] + ", ");
            }
            bw.close();
            System.out.println("Done: fibo.txt is created at '" + PATH + "' folder");

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
    
}
