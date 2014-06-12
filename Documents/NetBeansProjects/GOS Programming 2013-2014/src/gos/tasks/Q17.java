/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Çağrı Çakır
 */
public class Q17 {

    private int numberA;
    private int numberB;
    private double difference;
    private double division;
    
    public void catchException() 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers to differ between them");
        boolean continueLoop = true;
        
        do {
            try{
                numberA = in.nextInt();
                numberB = in.nextInt();
                System.out.println("difference: " + (difference = numberA - numberB));
                System.out.println("division: " + (division = numberA / numberB));
                break;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nException: %s\n", inputMismatchException);
                in.nextLine(); 
                System.out.println("You must enter integers.\n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("\nException: %s\n", arithmeticException);
                System.out.println("Zero is an invalid denominator. Please try again.\n");
            } 
        }while (continueLoop);
    }  
}
