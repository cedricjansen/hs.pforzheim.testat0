/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testat0;

/**
 *
 * @author Cedric Jansen
 */
public class Testat0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        // Integer numbers are whole numbers e.g. 5, 7, 245, 138
        int n1, n2, n3;
        // Doubles are numbers lik3 3.778768546745673562462345137
        double myRandom;

        // String declaration
        String username = "Cedric Jansen";
        // Array declaration
        String prenames[] = {"Anna", "Klara", "Sofie"};

        // Hello World - introduction
        System.out.println("Hello World, ");
        System.out.println("This is " + args[0]);

        // Addition and method calling
        n1 = 6 + 7;
        n2 = n1 + 13;

        n3 = add(n1, n2);
        System.out.println("Result is: " + n3);

        n2 = add(17, 4);
        System.out.println("The Result is now: " + n2);

        n3 = add(n1, n2);
        System.out.println("Result is now: " + n3);

        // Working with arrays
        System.out.println("We have " + prenames.length + " ladies with us.");
        System.out.println("Thery are: ");

        // Working with for loops
        for (int i = 0; i < prenames.length; i++) {
            // Executes as long as i is smaller than the length of
            // the prenames array.
            System.out.print("This is loop number " + i + " : ");
            System.out.println(prenames[i]);
        }

        // Args is an array of strings that is put into the 
        // main method.
        System.out.println("Length of args is actuallay " + args.length);

        //Streams through the args array
        for (int i = 0; i < args.length; i++) {
            // Executes as long as i is smaller than the length of
            // the prenames array.
            System.out.print("This is args[" + i + "]: ");
            System.out.println(prenames[i]);
        }

        // Using external methods
        // Generating a random number between 1 and 49   
        myRandom = 1 + (49 * Math.random());
        
        //Typecasting
        n1 = (int) myRandom;
        System.out.println("The random number is: " + n1);
        
        //Castin e.g. a String into an Integer
        int newInteger= Integer.parseInt("1234");

    }

    // Extern method that can be used by anyone because
    // it is public. It returns an integer because int follows static ( no object ).
    // Void method do not return a value.
    public static int add(int number1, int number2) {
        int result = 0;
        result = number1 + number2;

        return result;
    }

}
