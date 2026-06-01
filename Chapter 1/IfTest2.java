class IfTest2 {
    public static void main(String[] args) {

        // Declare and initialize variable x with value 2
        int x = 2;

        // Check if x is equal to 3
        if (x == 3) {
            // Executes only if x equals 3
            System.out.println("x must be 3");

        } else {
            // Executes if the if condition is false (x is anything other than 3)
            System.out.println("x is NOT 3");
        }

        // This line always executes, regardless of the if/else result
        System.out.println("This runs no matter what");
    }
}