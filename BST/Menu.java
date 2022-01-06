/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NITRO5
 */
public class Menu extends ArrayList<String>{
    Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public int getUserChoice() {
        // TODO code application logic here
        for(int i = 0; i < this.size(); i++)
            System.out.println("\n" + (i + 1) + this.get(i));
        System.out.println("\n0 for quit. Choose:");
        return Integer.parseInt(sc.nextLine());  
    } 
}
