/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testat0;

import java.util.Scanner;

/**
 * Here we will program a Body Mass Index - Calculator
 *
 * @author Cedric Jansen
 */
public class CalculateBMI {

    /**
     * @param args the command line arguments
     *
     * If they are present ( command line arguments ) then they are: args[0] is
     * the name of the person. args[1] is the weight args[2} is the size e.g.
     * 1.82 (meters).
     *
     * If an argument is missing/wrong, we ask the user for input.
     */
    public static void main(String[] args) {
        String person = ""; // Person's name we calculate the BMI of.
        int weight = 0;     // The person's weigth.
        double size = 0.0;  // The person's size.
        double bmi = 0.0;  // Resulting BMI of the person after the calculation.

        // Load variables from args array if possible.
        // Load the first variable.
        if (args.length >= 1) {  // There is at least one argument present: the name.
            person = args[0];
        }

        // Load the second variable.
        if (args.length >= 2) {  // There are  at least two argument present; name, weight.
            try {
                weight = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                weight = 0;
            }
        }

        // Load the third and last variable.
        if (args.length >= 3) {  // There are  at least three argument present; name, weight, size.
            try {
                size = Double.parseDouble(args[2]);
            } catch (NumberFormatException e) {
                size = 0.0;
            }
        }

        System.out.println("Person is: " + person);
        System.out.println("Weight is: " + weight);
        System.out.println("Size is:  " + size);

        // Check for missing or weird values.
        // 1. Check the name!
        person = checkPerson(person);   // Checks if person's name is ok!
        weight = checkWeight(weight);   // Checks if the person's weight is ok!
        size = checkSize(size);         // Checks if the peron's size is ok!

        System.out.println("Checked argument are: ");
        System.out.println("Person is: " + person);
        System.out.println("Weight is: " + weight);
        System.out.println("Size is:  " + size);

        // Calculate the BMI      
        bmi = weight / (size * size);

        // Optimize BMI to only show 2 digits
        bmi = ((int) (bmi * 100.0)) / 100.0;
        System.out.println("The BMI of " + person + " is: " + bmi);

        // Using and initialising Objects
        CalculateBMI myBMI = new CalculateBMI();
        int stringLength = myBMI.testMe("test");
        System.out.println("Result is " + stringLength);
    }

    private int testMe(String something) {
         System.out.println("test");    
         System.out.println("This is bmimachine.");
         return  something.length();
    }

    private static String checkPerson(String name) {
        Scanner s = new Scanner(System.in);
        // First, eliminate leading and trailing spaces
        name = name.trim();
        // If name is too short (lower than 2)
        // Ask the user for another name input
        while (name.length() < 2) {
            System.out.print("Please enter correct persons name: ");
            // read input from keyboard
            name = s.next();
            name = name.trim();
        }

        return name;
    }

    private static int checkWeight(int weight) {
        String input = "";
        Scanner s = new Scanner(System.in);

        while (weight <= 0) {
            System.out.println("Please enter correct persons weight: ");
            input = s.next();
            input = input.trim();

            try {
                weight = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                weight = 0;
            }
        }

        return weight;
    }

    private static double checkSize(double size) {
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (size <= 0.0 || size > 2.4) {
            System.out.println("Please enter correct person's size: ");
            input = scanner.next();
            input = input.trim();

            try {
                size = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                size = 0.0;
            }

        }
        return size;
    }

}
