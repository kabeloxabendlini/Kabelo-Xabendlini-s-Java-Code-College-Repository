/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

/**
 *
 * @author Admin
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class FoofTestDrive {

    public static void main(String[] args) {

        // Create a Foof object
        Foof foof = new Foof();

        // Display the values of the final instance variables
        System.out.println("Size: " + foof.size);
        System.out.println("Whuffie: " + foof.whuffie);

        // Call the doStuff() method.
        // The parameter is final, so it cannot be changed
        // inside the method.
        foof.doStuff(100);

        // Call the doMore() method.
        // It contains a final local variable.
        foof.doMore();

        System.out.println("Methods executed successfully.");
    }
}