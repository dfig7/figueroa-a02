/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Diego Figueroa
 */

/*
Ask user for length and width to calculate area or ceiling
Divide the area by gallons of paint to find amount of gallons
    each gallon has 350 sq feet of paint, so <area/gallon>
Round up if the amount of gallons is a decimal ot the next whole number
 */

import java.util.Scanner;

public class Solution09 {
    private static final Scanner input = new Scanner(System.in);
    private static final double GALLON = 350;

    public static int calcArea(){
        System.out.println("What is the length of the room in feet? ");
        int length = input.nextInt();
        System.out.println("What is the width of the room in feet? ");
        int width = input.nextInt();
        int area = length * width;
        return area;
    }
    public static void calcGallons(){
        double area = calcArea();
        double gallons = Math.ceil(area/GALLON);
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", gallons, area);
    }

    public static void main(String[] args) {
        calcGallons();
    }
}
