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
 * PoorDog class
 * Represents a dog with a size and a name.
 * The instance variables are private, so they cannot be
 * accessed directly from outside the class.
 */
class PoorDog {

    // Stores the size of the dog
    private int size;

    // Stores the name of the dog
    private String name;

    /*
     * Returns the size of the dog.
     *
     * @return the dog's size
     */
    public int getSize() {
        return size;
    }

    /*
     * Returns the name of the dog.
     *
     * @return the dog's name
     */
    public String getName() {
        return name;
    }
}