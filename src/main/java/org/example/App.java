/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Enter the principal: " );
        double principal = sc.nextDouble();

        System.out.println( "Enter the rate of interest: " );
        double interest = sc.nextDouble();

        System.out.println( "Enter the number of years: " );
        double years = sc.nextDouble();

        interest = interest / 100;
        double A = principal * (1 +(interest * years));

        System.out.println( "After " + (int)years + " years at " + (interest * 100) + "%, the investment will be worth $" + (Math.round(A*100.0)/100.0) + ".");
    }
}
