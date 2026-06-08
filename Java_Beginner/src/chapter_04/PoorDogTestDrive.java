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
 * PoorDogTestDrive class
 * Creates a PoorDog object and displays its size and name
 * using the getter methods.
 */
public class PoorDogTestDrive {

    public static void main(String[] args) {

        // Create a new PoorDog object
        PoorDog one = new PoorDog();

        // Display the dog's size
        System.out.println("Dog size is " + one.getSize());

        // Display the dog's name
        System.out.println("Dog name is " + one.getName());
    }
}