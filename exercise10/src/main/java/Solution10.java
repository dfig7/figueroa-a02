/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Diego Figueroa
 */

/*
Prompt user with question that asks for price and quantity of items
    use a for loop function to ask each question
        calculates subtotal
Calculate tax from subtotal
calculate total by adding subtotal<tax/.055> and tax
 */

import java.util.Scanner;

public class Solution10 {
    private static final Scanner input = new Scanner(System.in);
    private static double TAX = .055;

    public static double subtotal(){
        double subtotal = 0;
        for(int i= 1; i<=3; i++){
            System.out.println("Enter the price of the item: ");
            int price = input.nextInt();
            System.out.println("Enter the quantity of item: ");
            int quantity = input.nextInt();

            subtotal += price*quantity;
        }
        System.out.printf("Subtotal: $%.02f\n",subtotal);
        return subtotal;
    }

    public static double tax(){
        double subtotal = subtotal();
        double tax = subtotal * TAX;
        System.out.printf("Tax: $%.02f\n",tax);
        return tax;
    }

    public static void main(String[] args) {
        double tax = tax();
        double total = tax + (tax/TAX);
        System.out.printf("Total: $%.02f", total);

    }
}
