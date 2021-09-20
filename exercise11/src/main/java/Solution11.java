/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Diego Figueroa
 */

/*
Ask user how many euros he is exchanging
ask what is the exchange rate
using the to/from = exchange formula we can derive that US = Euros*rate
Print US answer
 */

import java.util.Scanner;

public class Solution11 {
    private static final Scanner input = new Scanner(System.in);

    public static void conversion(){
        System.out.println("How many euros are you exchanging? ");
        double numEuros = input.nextDouble();
        System.out.println("What is the exchange rate? ");
        double rate = input.nextDouble();
        double answer = Math.ceil(numEuros*rate * 100) /100;
        System.out.printf("%.2f euros at an exchange rate of %.4f is%n", numEuros, rate);
        System.out.printf(".2f U.S. dollars.", answer);


    }

    public static void main(String[] args) {
        conversion();
    }
}
