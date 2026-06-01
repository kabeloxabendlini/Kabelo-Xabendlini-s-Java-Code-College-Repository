class PoolPuzzleOne {
    public static void main(String[] args) {

        // Declare and initialize loop counter x with value 0
        int x = 0;

        // Loop runs while x is less than 4 (runs for x = 0, 1, 2, but skips to end on x = 2)
        while (x < 4) {

            // Always prints "a" at the start of every iteration
            System.out.print("a");

            // Only prints a space when x is 0 (first iteration only)
            if (x < 1) {
                System.out.print(" ");
            }

            // Always prints "n" on every iteration
            System.out.print("n");

            // When x is 2 or 3, prints " oyster" and jumps x forward by 2, skipping later conditions
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2; // Incrementing x by 2 here causes the loop to exit after this iteration
            }

            // Only prints "noys" when x is exactly 1 (second iteration)
            if (x == 1) {
                System.out.print("noys");
            }

            // Only prints "oise" when x is 0 (first iteration only)
            if (x < 1) {
                System.out.print("oise");
            }

            // Prints a newline at the end of each iteration, moving output to the next line
            System.out.println();

            // Increment x by 1 at the end of every iteration
            x = x + 1;
        }
    }
}