/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_18;

/**
 *
 * @author Admin
 */

import java.util.concurrent.atomic.AtomicInteger;

class AtomicBankAccount {

    private final AtomicInteger balance = new AtomicInteger(100);

    public int getBalance() {
        return balance.get();
    }

    public void spend(String name, int amount) {
        int initialBalance = balance.get();
        if (initialBalance >= amount) {
            boolean success = balance.compareAndSet(initialBalance, initialBalance - amount);
            if (!success) {
                System.out.println("Sorry " + name + ", you haven't spent the money.");
            }
        } else {
            System.out.println("Sorry, not enough for " + name);
        }
    }
}
