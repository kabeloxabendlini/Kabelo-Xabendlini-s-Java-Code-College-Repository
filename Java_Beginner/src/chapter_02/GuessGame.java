/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02;

/**
 *
 * @author Admin
 */
// GuessGame class manages a number guessing game between three players
public class GuessGame {

    // Declare three Player objects
    Player p1;
    Player p2;
    Player p3;

    // Method that starts and controls the game
    public void startGame() {

        // Create three Player objects
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Variables to store each player's guess
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Flags to track whether each player guessed correctly
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // Generate a random target number between 0 and 9
        int targetNumber = (int) (Math.random() * 10);

        // Display game instructions
        System.out.println("I'm thinking of a number between 0 and 9...");

        // Continue playing until a player guesses correctly
        while (true) {

            // Display the target number (useful for testing/debugging)
            System.out.println("Number to guess is " + targetNumber);

            // Ask each player to make a guess
            p1.guess();
            p2.guess();
            p3.guess();

            // Retrieve and display each player's guess
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            // Check if Player 1 guessed correctly
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }

            // Check if Player 2 guessed correctly
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }

            // Check if Player 3 guessed correctly
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            // If any player guessed correctly, end the game
            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");

                // Exit the loop because the game is finished
                break;

            } else {

                // No correct guesses, continue the game
                System.out.println("Players will have to try again.");
            }
        }
    }
}
