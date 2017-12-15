/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wagecalculator;

import java.util.*;

/**
 *
 * @author seemab
 */
public class WageCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter rate:");
        double rate;
        rate = s.nextDouble();
        
        System.out.print("Enter hours:");
        int hours;
        hours = s.nextInt();
        double wages;
        wages = calcWages(rate , hours) ;
            
        System.out.println("Wages = " + wages);
        
    }
    public static double calcWages(double rate, int hours)
    {
        double wages;
        if(hours < 40) { 
            wages = rate*hours;
        } else if (hours < 50) {
            wages = 40*rate + (hours - 40)*1.5*rate;
        }else if (hours < 60) {
            wages = 40*rate + (hours - 40)*2.5*rate;
        } else {
            wages = 40*rate + (hours - 40)*3.5*rate;
        }
        return wages;
    }
}
