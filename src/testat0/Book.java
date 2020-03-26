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

    private String isbn;
    private String bookName;
    private String author;

    // CRUD - Create, Read, Update, Use - C  R  U  D
    void create() {
        Scanner scanner = new Scanner(System.in);
        // Book name
        System.out.print("Enter book name: ");
        bookName = scanner.nextLine();

        // Book isbn
        System.out.print("Enter book ISBN: ");
        isbn = scanner.nextLine();

        // Book author
        System.out.print("Enter book author: ");
        author = scanner.nextLine();
    }

    void read() {
        System.out.print("Book " + isbn);
        System.out.print(": " + bookName);
        System.out.println("  (Author:  " + author + ")");
    }

    void update() {
        Scanner scanner = new Scanner(System.in);
        // Book name
        System.out.println("Current book name is: " + bookName);
        System.out.print("Update book name to: ");
        bookName = scanner.nextLine();

        // Book isbn
        System.out.println("Current ISBN is: " + isbn);
        System.out.print("Update ISBN to: ");
        isbn = scanner.nextLine();

        // Book author
        System.out.println("Current author name is: " + author);
        System.out.print("Update author to: ");
        author = scanner.nextLine();
    }

    void delete() {
        bookName = null;
        isbn = null;
        author = null;
    }
}
