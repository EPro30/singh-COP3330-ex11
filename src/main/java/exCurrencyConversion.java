/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exCurrencyConversion {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        int euros = sc.nextInt();
        System.out.println("What is the exchange rate?");
        double exRate = sc.nextDouble();

        double dollars = euros*exRate; //conversion from euros to dollars based on the exchange rate

        System.out.printf("%d euros at an exchange rate of %.4f is %.2f U.S. dollars", euros, exRate, dollars);
    }
}
