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
    Book[] books = new Book[MAXBOOKS];
    
    
    public static void main(String[] agrs) {
        BookManager jonny = new BookManager();
        jonny.go();
    }

    public void go() { // Job of a book manager
        Scanner s = new Scanner(System.in); // reading keaboard input
        int numberOfBooks = 0;
        int userInput = 0;
        char answer = 0;
        
         
        do { // start a loop with your job
            System.out.println("\n Book Management System V. 1.0");
            System.out.println("1: Add Books");
            System.out.println("2: Show Books");
            System.out.println("3: Update Books");
            System.out.println("4: Delete Books");
            System.out.println("5: Show ALL books");
            System.out.println("0: EXIT");
            
            System.out.print("Your choice: ");
            userInput = s.nextInt();
            
            
            switch(userInput) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    if(numberOfBooks == MAXBOOKS) {
                        System.out.println("Sorry: No more space in the store left!");
                        break;
                    }
                    do {
                        System.out.println("Adding books: ");
                        Book aBook =  new Book();
                        aBook.create();
                        books[numberOfBooks] = aBook;
                        numberOfBooks++;
                        System.out.println("Want to add another book? (Y/N)");
                        answer = s.next().toUpperCase().charAt(0);
                    } while( answer == 'Y');
                    break;
                case 2:
                    System.out.println("You entered 2");
                    break;
                case 3:
                    System.out.println("You entered 3");
                    break;
                case 4:
                    System.out.println("You entered 4");
                    break;
                case 5:
                    if(numberOfBooks == 0) {
                        System.out.println("Sorry: No books in the store !");
                        break;
                    }
                    System.out.println("List of books: ");
                    for(int i = 0; i < numberOfBooks; i++) {
                        books[i].read();
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
            
        } while(true); // do your job forever: infinite loop!
        
        
        
        
    }
}
