import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Diego Figueroa
 */

/*
Ask user how many people are in the pizza party
Ask User how many pizzas there are
Ask user how many slices does each pizza have
Print the amount of slices there are by multiplying the amount of people and pizzas <people * pizza>
State how many slices does each person receive <slices/people>
State how many pizzas would be leftover by finding the remainder of <slices%people> using module "%"
 */

public class Solution08 {
    private static final Scanner input = new Scanner(System.in);

    public static int getPeople(){
        System.out.println("How many people? ");
        return input.nextInt();
    }

    public static int getPizzas(){
        System.out.println("How many pizzas do you have? ");
        return input.nextInt();
    }

    public static int getSlices(){
        System.out.println("How many slices per pizza? ");
        return input.nextInt();
    }

    public static void calcSlices(){
        int people = getPeople();
        int pizzas = getPizzas();
        int slicesPerPizza = getSlices();
        int totalSlices = slicesPerPizza * pizzas;
        int eachPerson = totalSlices/people;
        int leftOvers = totalSlices%people;
        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, totalSlices);
        System.out.printf("Each person gets %d pieces of pizza.\n", eachPerson);
        System.out.printf("There are %d leftover pieces.", leftOvers);

    }

    public static void main(String[] args) {
        calcSlices();
    }
}
