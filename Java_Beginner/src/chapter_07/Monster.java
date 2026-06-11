/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_07;

/**
 *
 * @author Admin
 */
class Monster {

    // Base version: every Monster can frighten
    boolean frighten(int degree) {
        System.out.println("generic monster sound");
        return false;
    }
}

class Vampire extends Monster {

    // Vampire's own version overrides Monster's
    boolean frighten(int degree) {
        System.out.println("hissss");
        return true;
    }
}

class Dragon extends Monster {

    // Dragon's own version overrides Monster's
    boolean frighten(int degree) {
        System.out.println("breathe fire");
        return true;
    }
}
