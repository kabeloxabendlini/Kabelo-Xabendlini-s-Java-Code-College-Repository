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
 * ElectricGuitar class
 * Represents an electric guitar with information about its brand,
 * number of pickups, and whether a rock star uses it.
 */
class ElectricGuitar {

    // Stores the brand name of the guitar
    String brand;

    // Stores the number of pickups on the guitar
    int numOfPickups;

    // Indicates whether a rock star uses this guitar
    boolean rockStarUsesIt;

    /*
     * Returns the brand of the guitar.
     */
    String getBrand() {
        return brand;
    }

    /*
     * Sets the brand of the guitar.
     *
     * @param aBrand The brand name to assign to the guitar
     */
    void setBrand(String aBrand) {
        brand = aBrand;
    }

    /*
     * Returns the number of pickups on the guitar.
     */
    int getNumOfPickups() {
        return numOfPickups;
    }

    /*
     * Sets the number of pickups on the guitar.
     *
     * @param num The number of pickups to assign
     */
    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    /*
     * Returns whether a rock star uses this guitar.
     */
    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    /*
     * Sets whether a rock star uses this guitar.
     *
     * @param yesOrNo true if a rock star uses it, false otherwise
     */
    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}