
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Diego Figueroa
 */

/*
ask user what the length and width of the room is
print "You entered dimensions of x feet by y feet" to show what the inputs are
print the area using the formula <length * width> for square feet and   <square_feet_area *  0.09290304> from constant

 */

import java.util.Scanner;

public class Solution07 {
    private static final Scanner input = new Scanner(System.in);

    private static final double CONVERSION = 0.09290304;

    public static double getLength(){
        System.out.println("What is the length of the room in feet? ");
        return input.nextDouble();
    }

    public static double getWidth(){
        System.out.println("What is the width of the room in feet? ");
        return input.nextDouble();
    }

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = length * width;
        double square_meters = area * CONVERSION;
        System.out.println("The area is");
        System.out.printf("%.0f square feet\n", area);
        System.out.printf("%.03f square meters", square_meters);

    }


}
