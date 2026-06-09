/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_05;

/**
 *
 * @author Admin
 */
public class SimpleStartupTestDrive {

    public static void main(String[] args) {

        SimpleStartup dot = new SimpleStartup();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        int userGuess = 2;

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}