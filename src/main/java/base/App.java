/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input, checks if non-numeric value found
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        String gender = in.nextLine();
        if (!gender.matches("[0-9]+")) {
            System.out.println("Invalid number");
            return;
        }
        System.out.print("How many ounces of alcohol did you have? ");
        String alcohol = in.nextLine();
        if (!alcohol.matches("[0-9]+")) {
            System.out.println("Invalid number");
            return;
        }
        System.out.print("What is your weight, in pounds? ");
        String weight = in.nextLine();
        if (!weight.matches("[0-9]+")) {
            System.out.println("Invalid number");
            return;
        }
        System.out.print("How many hours has it been since your last drink? ");
        String hours = in.nextLine();
        if (!hours.matches("[0-9]+")) {
            System.out.println("Invalid number");
            return;
        }
        //string conversion
        int g = Integer.parseInt(gender);
        int a = Integer.parseInt(alcohol);
        int w = Integer.parseInt(weight);
        int h = Integer.parseInt(hours);

        //outputs  for male
        if (g == 1){
            double r = 0.73;
            double BAC= (a * 5.14 / w * r) - (.015 * h);
            if (BAC >= 0.08)
            {
                System.out.println("Your BAC is " + BAC + ".\n It is not legal for you to drive.");
                return;
            }
            else
            {
                System.out.println("Your BAC is " + BAC + ".\n It is legal for you to drive.");
                return;
            }

        }
        //outputs for female
        else if (g == 2){
            double r = 0.66;
            double BAC= (a * 5.14 / w * r) - (.015 * h);
            if (BAC >= 0.08)
            {
                System.out.println("Your BAC is " + BAC + ".\n It is not legal for you to drive.");
                return;
            }
            else
            {
                System.out.println("Your BAC is " + BAC + ".\n It is legal for you to drive.");
                return;
            }
        }
        //if gender is entered not as a 1 or 2
        System.out.println("Gender error.");
        return;
    }
}
