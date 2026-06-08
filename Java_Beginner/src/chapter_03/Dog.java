/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_03;

/**
 *
 * @author Admin
 */
/*
 * Dog class
 * Demonstrates how objects and object references work in Java.
 */
class Dog {

    // Stores the dog's name
    String name;

    public static void main(String[] args) {

        // Create a Dog object and store its reference in dog1
        Dog dog1 = new Dog();

        // Call the bark() method before assigning a name
        dog1.bark();

        // Assign a name to the dog
        dog1.name = "Bart";

        // Create an array that can hold references to 3 Dog objects
        Dog[] myDogs = new Dog[3];

        // Create two new Dog objects and store them in the array
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();

        // Store the reference to dog1 in the third array element
        myDogs[2] = dog1;

        // Assign names to the first two dogs
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // Display the name of the third dog in the array
        // Since myDogs[2] refers to dog1, its name is "Bart"
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        // Loop through the array and tell each dog to bark
        int x = 0;

        while (x < myDogs.length) {

            // Call the bark() method on the current dog
            myDogs[x].bark();

            // Move to the next array element
            x = x + 1;
        }
    }

    // Makes the dog bark by printing its name
    public void bark() {
        System.out.println(name + " says Ruff!");
    }

    // Placeholder method for eating behavior
    public void eat() {
    }

    // Placeholder method for chasing a cat
    public void chaseCat() {
    }
}
