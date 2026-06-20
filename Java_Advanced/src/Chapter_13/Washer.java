/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13;

/**
 *
 * @author Admin
 */
public class Washer {

    Laundry laundry = new Laundry();

    public void foo() throws ClothingException {
        laundry.doLaundry();
    }

    public static void main(String[] args) throws ClothingException {
        Washer a = new Washer();
        a.foo();
    }
}
