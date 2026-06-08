/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_04;

/**
 *
 * @author Admin
 */
/*
 * GoodDogTestDrive class
 * Creates GoodDog objects, assigns sizes using setter methods,
 * displays their sizes using getter methods, and makes them bark.
 */
class GoodDogTestDrive {

    public static void main(String[] args) {

        // Create the first GoodDog object
        GoodDog one = new GoodDog();

        // Set the size of the first dog
        one.setSize(70);

        // Create the second GoodDog object
        GoodDog two = new GoodDog();

        // Set the size of the second dog
        two.setSize(8);

        // Display the size of the first dog
        System.out.println("Dog one: " + one.getSize());

        // Display the size of the second dog
        System.out.println("Dog two: " + two.getSize());

        // Make the first dog bark
        one.bark();

        // Make the second dog bark
        two.bark();
    }
}
