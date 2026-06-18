/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

/**
 *
 * @author Admin
 */
public class DuckTestDrive {

    public static void main(String[] args) {

        // Create three Duck objects
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Duck duck3 = new Duck();

        // Assign sizes to each duck
        duck1.setSize(10);
        duck2.setSize(20);
        duck3.setSize(30);

        // Display each duck's size
        System.out.println("Duck 1 size: " + duck1.getSize());
        System.out.println("Duck 2 size: " + duck2.getSize());
        System.out.println("Duck 3 size: " + duck3.getSize());

        // Display the total number of Duck objects created
        System.out.println("Total ducks created: " + Duck.getDuckCount());
    }
}
