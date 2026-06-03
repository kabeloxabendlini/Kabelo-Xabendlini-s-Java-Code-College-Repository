/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02;

/**
 *
 * @author Admin
 */
// GameLauncher class starts the GuessGame application
public class GameLauncher {

    // Main method - the entry point of the program
    public static void main(String[] args) {

        // Create a new GuessGame object
        GuessGame guessGame = new GuessGame();

        // Start the guessing game
        guessGame.startGame();
    }

} // End of GameLauncher class