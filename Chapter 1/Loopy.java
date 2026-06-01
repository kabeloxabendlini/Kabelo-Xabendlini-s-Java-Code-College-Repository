public class Loopy {
    public static void main(String[] args) {

        // Declare and initialize loop counter variable x with value 1
        int x = 1;

        // This prints once before the loop begins
        System.out.println("Before the Loop");

        // Loop continues as long as x is less than 4 (runs for x = 1, 2, 3)
        while (x < 4) {

            // These two lines print on every iteration of the loop
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);

            // Increment x by 1 each iteration to eventually break the loop condition
            x = x + 1;

        }

        // This prints once after the loop has finished
        System.out.println("This is after the loop");
    }
}