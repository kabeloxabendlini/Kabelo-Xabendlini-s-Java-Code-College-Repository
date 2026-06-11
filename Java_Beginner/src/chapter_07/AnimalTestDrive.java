/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_07;

/**
 *
 * @author Admin
 */
class AnimalTestDrive {

    public static void main(String[] args) {

        Animal[] animals = new Animal[5];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();

        for (Animal animal : animals) {
            animal.eat();
            animal.roam();
            animal.makeNoise();
        }
    }
}