/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_03.ExtraWork;

/**
 *
 * @author Admin
 */
/*
 * BooksTestDrive class
 * Creates an array of Book objects, assigns titles and authors,
 * and then displays the information for each book.
 */
class BooksTestDrive {

    public static void main(String[] args) {

        // Create an array that can hold 3 Books objects
        Books[] myBooks = new Books[3];

        // Loop counter
        int x = 0;

        // Create three Books objects and store them in the array
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        // Assign titles to each book
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";

        // Assign authors to each book
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        // Loop through the array and display each book's details
        while (x < 3) {

            // Print the book title
            System.out.print(myBooks[x].title);

            // Print a separator between the title and author
            System.out.print(" by ");

            // Print the author's name and move to the next line
            System.out.println(myBooks[x].author);

            // Move to the next array element
            x = x + 1;
        }
    }
}