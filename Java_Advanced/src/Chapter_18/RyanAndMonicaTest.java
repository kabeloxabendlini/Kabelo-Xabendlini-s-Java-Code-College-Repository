/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_18;

/**
 *
 * @author Admin
 */
import java.util.concurrent.*;

public class RyanAndMonicaTest {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
        RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(ryan);
        executor.execute(monica);
        executor.shutdown();
    }
}

class RyanAndMonicaJob implements Runnable {

    private final String name;
    private final BankAccount account;
    private final int amountToSpend;

    RyanAndMonicaJob(String name, BankAccount account, int amountToSpend) {
        this.name = name;
        this.account = account;
        this.amountToSpend = amountToSpend;
    }

    public void run() {
        goShopping(amountToSpend);
    }

    private void goShopping(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(name + " is about to spend");
            account.spend(amount);
            System.out.println(name + " finishes spending");
        } else {
            System.out.println("Sorry, not enough for " + name);
        }
    }
}

class BankAccount {

    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void spend(int amount) {
        balance = balance - amount;
        if (balance < 0) {
            System.out.println("Overdrawn!");
        }
    }
}

class LostUpdate {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        Balance balance = new Balance();
        for (int i = 0; i < 1000; i++) {
            pool.execute(() -> balance.increment());
        }
        pool.shutdown();
        if (pool.awaitTermination(1, TimeUnit.MINUTES)) {
            System.out.println("balance = " + balance.balance);
        }
    }
}

class Balance {

    int balance = 0;

    public void increment() {
        balance++;
    }
}
