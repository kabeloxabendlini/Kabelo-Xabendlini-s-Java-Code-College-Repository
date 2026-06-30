/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_18;

/**
 *
 * @author Admin
 */

public class BankAccount {

    private int balance = 100;

    public void spend(int amount) {
        if (amount <= balance) {
            System.out.println(Thread.currentThread().getName() + " is about to spend");
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " is done spending");
        } else {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }

    public int getBalance() {
        return balance;
    }
}
