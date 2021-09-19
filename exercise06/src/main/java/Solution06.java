import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Diego Figueroa
 */

/*
Ask user their age, "What is your current age?" and save age in <getAge>
Prompt user the age in which they would like to retire, "At what age would you like to retire?", and save in <retireAge>
Tell user how many years they have until they retire
    <retireAge> - <getAge>

 */

public class Solution06 {
    private static final Scanner input = new Scanner(System.in);

    public static int getAge(){
        System.out.println("What is your current age? ");
        return input.nextInt();
    }

    public static int retireAge(){
        System.out.println("At what age would you like to retire? ");
        return input.nextInt();
    }

    public static int getYear(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year;
    }
    public static void main(String[] args) {
        int userAge = getAge();
        int retire_age = retireAge();
        int yearsUntil = retire_age - userAge;
        System.out.printf("You have %d years left until you can retire.\n", yearsUntil);
        System.out.printf("It's %d, so you can retire in %d.", getYear(), getYear()+yearsUntil);

    }
}
