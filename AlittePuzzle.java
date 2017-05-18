/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alittepuzzle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class AlittePuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner text = new Scanner(new File("/Users/kendrabooker/Documents/AlittlePuzzle.txt"));
        String word = text.nextLine();
        
        for(int i=2; i<=word.length(); i+=3){
        
            char a = word.charAt(i);
            System.out.print(a);
        }
    }
    
}
