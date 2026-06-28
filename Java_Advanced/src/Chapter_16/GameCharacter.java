/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_16;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.util.Arrays;

public class GameCharacter implements Serializable {

    private final int power;
    private final String type;
    private final String[] weapons;

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        return Arrays.toString(weapons);
    }
}
