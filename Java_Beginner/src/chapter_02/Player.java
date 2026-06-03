/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_02;

/**
 *
 * @author Admin
 */
import java.util.Random;

public class Player {
  public int number;

  public void guess() {
    Random randomGenerator = new Random();
    number = randomGenerator.nextInt(10);
  }
}
