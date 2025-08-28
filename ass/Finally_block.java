public class Finally_block {
    public static void main(String[] args) {
                System.out.println("Case 1: No exception occurs");
                try {
                    int result = 10 / 2;  // No exception here
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Caught an ArithmeticException.");
                } finally {
                    System.out.println("Finally block executed (Case 1).");
                }

                System.out.println("\nCase 2: Exception occurs");
                try {
                    int result = 10 / 0;  // This will throw ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Caught an ArithmeticException.");
                } finally {
                    System.out.println("Finally block executed (Case 2).");
                }

                System.out.println("\nProgram continues after try-catch-finally blocks.");
            }
        }



