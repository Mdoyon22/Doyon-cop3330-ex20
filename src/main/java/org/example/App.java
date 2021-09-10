/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        double amount;
        double tax = 0, total = 0;
        System.out.print("What is the order amount? ");
        amount = inp.nextInt();
        System.out.print("What state do you live in? ");
        String s1 = inp2.next();

        if (s1.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            String s2 = inp.next();

            if (s2.equals("Eau Claire")) {
                tax = (amount * 5.005) / 100;
                total = tax + amount;
            } else if (s2.equals("Dunn")) {
                tax = (amount * 5.004) / 100;
                total = tax + amount;
            }
        }

        if (s1.equals("Illinois"))
        {
            tax = (amount * 8) / 100;
            total = tax + amount;
        }

        System.out.print("The tax is $" + String.format("%.2f", tax) + ".\n" + "The total is $" + String.format("%.2f", total));
    }
}




