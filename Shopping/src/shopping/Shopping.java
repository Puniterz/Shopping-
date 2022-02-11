/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.util.Scanner;
/**
 *
 * @author pupab0551
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        
        final double USB = 19.99;
        final double KEYBOARD = 49.99;
        final double MOUSE = 25.99;
        final double TAX_RATE = 0.13;
        
        //declared variables 
        int totalUSB;
        int totalKEYBOARD;
        int totalMOUSE;
        double price;
        
        //user input for how much of each product they would like to buy
        System.out.println("How many USB'S would you like to buy?");
        totalUSB = keyedInput.nextInt();
        System.out.println("How many keayboard would you like to buy?");
        totalKEYBOARD = keyedInput.nextInt();
        System.out.println("How many computer mice would you like to buy?");
        totalMOUSE = keyedInput.nextInt();
        
        //Calculate the total cost including tax
        price = ((USB * totalUSB) + (KEYBOARD * totalKEYBOARD) + (MOUSE * totalMOUSE)) * TAX_RATE;
        //output frendly message
        System.out.println("Your total cost with tax is: $"+ price +"");
        
        // TODO code application logic here
    }
    
}
