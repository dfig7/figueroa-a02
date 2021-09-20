
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

/*
Ask user how many people are in the pizza party
Ask User how many pizzas there are
Ask user how many slices does each pizza have
Print the amount of slices there are by multiplying the amount of people and pizzas <people * pizza>
State how many slices does each person receive <slices/people>
State how many pizzas would be leftover by finding the remainder of <slices%people> using module "%"
 */
public class Solution12 {
    private static final Scanner input = new Scanner(System.in);

    public static int getPrincipal(){
        System.out.println("Enter the principal: ");
        return input.nextInt();
    }

    public static double getRate(){
        System.out.println("Enter the rate of interest: ");
        return input.nextDouble();
    }
    public static int getYears(){
        System.out.println("Enter the number of years: ");
        return input.nextInt();
    }

    public static void calcAmountAccrued(){
        int principal = getPrincipal();
        double rate = getRate();
        int years = getYears();

        double total = Math.ceil((principal * (1+(rate/100) * ((double)years)) * 100)/100);
        System.out.printf("After %d years at %.01f, the investment will be worth $%.02f", years, rate, total);
    }

    public static void main(String[] args) {
        calcAmountAccrued();
    }
}
