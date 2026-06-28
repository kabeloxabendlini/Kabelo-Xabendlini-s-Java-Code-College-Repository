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

class ReadAFile {

    public static void main(String[] args) {
        // Use the exact path you specified
        File myFile = new File("C:\\Users\\Admin\\Documents\\Code College Repositories\\Java - Code College\\Classwork\\Java_Advanced\\src\\Chapter_16\\MyText.txt");

        // 1. Create the file automatically if it doesn't exist yet
        if (!myFile.exists()) {
            try (FileWriter writer = new FileWriter(myFile)) {
                writer.write("Question 1/Answer 1\n");
                writer.write("Question 2/Answer 2\n");
                System.out.println("File created successfully at: " + myFile.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Could not create the file.");
                e.printStackTrace();
                return; // Stop running if creation failed
            }
        }

        // 2. Read the file contents
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            String line;
            System.out.println("--- Reading File Contents ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
