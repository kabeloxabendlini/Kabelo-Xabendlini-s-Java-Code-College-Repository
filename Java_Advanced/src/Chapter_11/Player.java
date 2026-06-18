/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

/**
 *
 * @author Admin
 */
class Player {

    static int playerCount = 0;
    private String name;

    public Player(String n) {
        name = n;
        playerCount++;
    }
}
