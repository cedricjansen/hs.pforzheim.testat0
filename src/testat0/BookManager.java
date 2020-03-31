/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testat0;

import java.util.Scanner;

/**
 *
 * @author Cedric Jansen
 */
public class BookManager {

    final int MAXBOOKS = 20; // Maximum of books that a bookmanager can handle at once.
    // Variables not declared with static belong to the object of a class, not the class
    // itself. Here: Every object build with the BookManger class has it's own book array.
    Book[] books = new Book[MAXBOOKS];

    public static void main(String[] agrs) {
        BookManager jonny = new BookManager();
        jonny.go();

        // For futher examples adding another object of the same class
        // In general, there can be as many objects derived from the same class
        // as you want.
        BookManager klara = new BookManager();
        klara.go();

    }

    public void go() { // Job of a book manager
        Scanner s = new Scanner(System.in); // reading keaboard input
        int numberOfBooks = 0;
        int userInput = 0;
        char answer = 0;

        do { // start a loop with your job
            System.out.println("\n Book Management System V. 1.0");
            System.out.println("1: Add Books");
            System.out.println("2: Show a Book");
            System.out.println("3: Update Books");
            System.out.println("4: Delete Books");
            System.out.println("5: Show ALL books");
            System.out.println("0: EXIT");

            System.out.print("Your choice: ");
            userInput = s.nextInt();

            switch (userInput) {
                case 0:
                    System.exit(0);
                    break;
                case 1: // Create/ Add a book
                    if (numberOfBooks == MAXBOOKS) {
                        System.out.println("Sorry: No more space in the store left!");
                        break;
                    }
                    do {
                        System.out.println("Adding books: ");
                        Book aBook = new Book();
                        // Use setter
                        // aBook.setIsbn("??hahahah");
                        aBook.create();
                        books[numberOfBooks] = aBook;
                        numberOfBooks++;
                        System.out.println("Want to add another book? (Y/N)");
                        answer = s.next().toUpperCase().charAt(0);
                    } while (answer == 'Y');
                    break;
                case 2: // Show a certain book
                    if (numberOfBooks == 0) {
                        System.out.println("Sorry: No book in store!");
                        break;
                    }
                    System.out.println("\nEnter book index from 0 to " + (numberOfBooks - 1));
                    userInput = s.nextInt();
                    if (userInput >= 0 && userInput < numberOfBooks) {
                        books[userInput].read();
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 3: // Update book
                    if (numberOfBooks == 0) {
                        System.out.println("Sorry: No book to update in store!");
                        break;
                    }
                    System.out.println("\nEnter book index from 0 to " + (numberOfBooks - 1) + " to update.");
                    userInput = s.nextInt();
                    if (userInput >= 0 && userInput < numberOfBooks) {
                        books[userInput].update();
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 4: // Delete book
                    if (numberOfBooks == 0) {
                        System.out.println("Sorry: No book to delete in store!");
                        break;
                    }
                    System.out.println("\nEnter book index from 0 to " + (numberOfBooks - 1) + " to delete.");
                    userInput = s.nextInt();
                    if (userInput >= 0 && userInput < numberOfBooks) {
                        books[userInput].delete();
                        for( int i = userInput; userInput < numberOfBooks - 1; i++) {
                            books[i] = books[i+1];
                        }
                        numberOfBooks--;
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case 5:
                    if (numberOfBooks == 0) {
                        System.out.println("Sorry: No books in the store !");
                        break;
                    }
                    System.out.println("List of books: ");
                    for (int i = 0; i < numberOfBooks; i++) {
                        books[i].read();
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }

        } while (true); // do your job forever: infinite loop!

    }
}
