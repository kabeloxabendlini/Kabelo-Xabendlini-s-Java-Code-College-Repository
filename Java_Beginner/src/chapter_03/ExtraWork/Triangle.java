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
 * Triangle class
 * Demonstrates creating objects in an array, assigning values
 * to object variables, calculating areas, and working with
 * object references.
 */
class Triangle {

    // Stores the area of the triangle
    double area;

    // Stores the height of the triangle
    int height;

    // Stores the length (base) of the triangle
    int length;

    public static void main(String[] args) {

        // Loop counter
        int x = 0;

        // Create an array that can hold 4 Triangle objects
        Triangle[] ta = new Triangle[4];

        // Create and initialize each Triangle object
        while (x < 4) {

            // Create a new Triangle object
            ta[x] = new Triangle();

            // Assign height values: 2, 4, 6, 8
            ta[x].height = (x + 1) * 2;

            // Assign length values: 4, 5, 6, 7
            ta[x].length = x + 4;

            // Calculate and store the area
            ta[x].setArea();

            // Display the triangle number and its area
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);

            // Move to the next array element
            x = x + 1;
        }

        // Store the current value of x (which is now 4)
        int y = x;

        // Change x to a different value
        x = 27;

        // Create a reference to the third Triangle object
        // (the object stored at index 2)
        Triangle t5 = ta[2];

        // Change the area of the third Triangle object
        ta[2].area = 343;

        // Display y and the area of the object referenced by t5
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    /*
     * Calculates the area of the triangle using:
     * area = (height × length) / 2
     */
    void setArea() {
        area = (height * length) / 2;
    }
}