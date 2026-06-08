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
 * GoodDog class
 * Represents a dog whose size is kept private and can only be
 * accessed or modified through getter and setter methods.
 */
class GoodDog {

    // Private instance variable that stores the dog's size
    // It cannot be accessed directly from outside the class
    private int size;

    /*
     * Returns the current size of the dog.
     *
     * @return the dog's size
     */
    public int getSize() {
        return size;
    }

    /*
     * Sets the size of the dog.
     *
     * @param s the new size of the dog
     */
    public void setSize(int s) {
        size = s;
    }

    /*
     * Makes the dog bark.
     * The sound of the bark depends on the dog's size.
     */
    void bark() {

        // Large dog
        if (size > 60) {
            System.out.println("Wooof! Wooof!");

        // Medium-sized dog
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");

        // Small dog
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}