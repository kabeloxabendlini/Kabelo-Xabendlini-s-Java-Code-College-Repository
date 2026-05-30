public class BottleSong {

    public static void main(String[] args) {
        // Start the countdown with 10 bottles
        int bottlesNum = 10;

        // Default plural word for the starting stanzas
        String word = "bottles";

        // Loop runs as long as there is at least 1 bottle on the wall
        while (bottlesNum > 0) {

            // Check if we are currently starting a stanza with exactly 1 bottle
            if (bottlesNum == 1) {
                word = "bottle"; // Change to singular for the opening lines
            }

            // Print the first two identical lines of the stanza
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            
            // Print the action line
            System.out.println("And if one green bottle should accidentally fall,");

            // Decrement: One bottle falls off the wall
            bottlesNum = bottlesNum - 1;

            // =========================================================================
            // FIXED BUG HERE: Re-checking grammar for the remaining bottles.
            // In the original code, if bottlesNum dropped to 1 here, the 'word' variable 
            // was still set to "bottles" (plural), causing a grammatical error.
            // We update the word to singular here if exactly 1 bottle remains.
            // =========================================================================
            if (bottlesNum == 1) {
                word = "bottle"; 
            }
            // =========================================================================

            // Check if there are still bottles remaining on the wall
            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum +
                " green " + word + ", hanging on the wall");
            } 
            // If no bottles are left, print the final concluding line
            else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            } // end else

            // Print an empty line between verses to make the output easy to read
            System.out.println();

        } // end while loop

    } // end main method
    
} // end class
