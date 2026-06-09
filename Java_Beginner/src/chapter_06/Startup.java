/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_06;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class Startup {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {

        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {

            locationCells.remove(index);

            if (locationCells.isEmpty()) {

                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :(");

            } else {

                result = "hit";
            }
        }

        return result;
    }
}