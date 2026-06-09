/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_05;

/**
 *
 * @author Admin
 */
public class SimpleStartupGame {

    public static void main(String[] args) {

        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();
        SimpleStartup theStartup = new SimpleStartup();

        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {

            int guess = helper.getUserInput("Enter a number");

            String result = theStartup.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses.");
            }
        }
    }
}
