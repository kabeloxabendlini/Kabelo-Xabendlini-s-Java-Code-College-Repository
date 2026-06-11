/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_07;

/**
 *
 * @author Admin
 */
class PetOwner {

    public void start() {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();
        vet.giveShot(dog);
        vet.giveShot(hippo);
    }
}
