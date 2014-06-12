/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gos.tasks;

import gos.test.TestAllCodeSnippets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Çağrı Çakır
 */
public class Q6 {
    
    public void copyContent() throws FileNotFoundException, IOException
    {
        FileReader in = null;
        FileWriter out;
        
        try {
            String PATH = TestAllCodeSnippets.folder;
            in = new FileReader(PATH + File.separator + "IOStream" + File.separator + "input.txt");
            out = new FileWriter(PATH + File.separator + "IOStream" + File.separator + "output.txt");
            
            // This uses a java.util.Scanner, telling it to delimit the input with \Z, 
            // which is the end of the string anchor. This ultimately makes the input 
            // have one actual token, which is the entire file, so it can be read with one call to next().
            String reversed = new Scanner(new File(PATH + File.separator + "IOStream" + File.separator + "input.txt")).useDelimiter("\\Z").next();
            try (BufferedWriter bw = new BufferedWriter(out)) {
                bw.write(reverse(reversed));
            }

            System.out.println("Done");
            
        } catch(IOException io) {
        }
    }
        

    private String reverse(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Reverse of entered string is: " + reverse);
        return reverse;
    }
}
