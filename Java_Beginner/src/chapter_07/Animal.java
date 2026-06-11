/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_07;

/**
 *
 * @author Admin
 */
class Animal {
    void eat() {
        System.out.println("munch munch");
    }
    void roam() {
        System.out.println("roam roam");
    }
    void makeNoise() {                        // added so Vet.java can call it
        System.out.println("...");
    }
}

class Dog extends Animal {
    void roam()      { System.out.println("Dog roams the neighbourhood"); }
    void makeNoise() { System.out.println("Woof!"); }
}

class Cat extends Animal {
    void roam()      { System.out.println("Cat roams the house"); }
    void makeNoise() { System.out.println("Meow!"); }
}

class Wolf extends Animal {
    void roam()      { System.out.println("Wolf roams the forest"); }
    void makeNoise() { System.out.println("Howl!"); }
}

class Hippo extends Animal {
    void roam()      { System.out.println("Hippo roams the river"); }
    void makeNoise() { System.out.println("Grunt!"); }
}

class Lion extends Animal {
    void roam()      { System.out.println("Lion roams the savanna"); }
    void makeNoise() { System.out.println("Roar!"); }
}

