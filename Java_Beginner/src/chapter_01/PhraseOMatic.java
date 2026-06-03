/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_01;

/**
 *
 * @author Admin
 */
public class PhraseOMatic {
    public static void main(String[] args) {

        // Define the first word list — descriptive adjectives/properties
        String[] wordListOne = {"agnostic", "opinionated",
                "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled",
                "strongly typed"};

        // Define the second word list — architectural/design buzzwords
        String[] wordListTwo = {"loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub", "IoT", "cloud native",
                "service oriented", "containerized", "serverless",
                "microservices", "distributed ledger"};

        // Define the third word list — technical nouns/concepts
        String[] wordListThree = {"framework", "library",
                "DSL", "REST API", "repository", "pipeline", "service mesh",
                "architecture", "perspective", "design",
                "orientation"};

        // Get the number of words in each list to use as bounds for random number generation
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Create a random number generator instance
        java.util.Random randomGenerator = new java.util.Random();

        // Generate a random index for each word list
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // Combine one word from each list to build a random phrase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];

        // Print the final generated phrase
        System.out.println("What we need is a " + phrase);
    }
}