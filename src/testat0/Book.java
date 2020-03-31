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
public class Book {

    // Only attributes defined outside a method belong to the
    // object (as long as there is no static modifier).
    // These variables are called: instance variables -> belong to an instance (object).
    /*
     *  In general, instance variables should be declared as private, so only
     *  the object itself can access those variables but no extern class.
    */
    
    // Those variables can be accessed with getters and setters, where
    // extra code can be implemented to check unwanted assignments
    // and block them.
    private String isbn;
    private String bookName;
    private String author;

    // CRUD - Create, Read, Update, Use - C  R  U  D
    void create() {
        //Variables within a method are called: local variables
        Scanner scanner = new Scanner(System.in);
        // Book name
        System.out.print("Enter book name: ");
        setBookName(scanner.nextLine());

        // Book isbn
        System.out.print("Enter book ISBN: ");
        setIsbn(scanner.nextLine());

        // Book author
        System.out.print("Enter book author: ");
        setAuthor(scanner.nextLine());
    }

    void read() {
        System.out.print("Book " + getIsbn());
        System.out.print(": " + getBookName());
        System.out.println("  (Author:  " + getAuthor() + ")");
    }

    void update() {
        Scanner scanner = new Scanner(System.in);
        // Book name
        System.out.println("Current book name is: " + getBookName());
        System.out.print("Update book name to: ");
        setBookName(scanner.nextLine());

        // Book isbn
        System.out.println("Current ISBN is: " + getIsbn());
        System.out.print("Update ISBN to: ");
        setIsbn(scanner.nextLine());

        // Book author
        System.out.println("Current author name is: " + getAuthor());
        System.out.print("Update author to: ");
        setAuthor(scanner.nextLine());
    }

    void delete() {
        setBookName(null);
        setIsbn(null);
        setAuthor(null);
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        //Set the method param isbn to the isbn of the object
        this.isbn = isbn;
    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
