public class Nested_Try_Block {
    public static void main(String[] args) {
                try {
                    System.out.println("Outer try block started.");

                    // Outer try block can catch one type of exception
                    int[] numbers = {1, 2, 3};

                    try {
                        // Inner try block for a different type of exception
                        int result = 10 / 0;  // This will cause ArithmeticException
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Caught ArithmeticException in inner try block: " + e.getMessage());
                    }

                    // This will cause ArrayIndexOutOfBoundsException
                    System.out.println("Accessing 5th element: " + numbers[4]);

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Caught ArrayIndexOutOfBoundsException in outer try block: " + e.getMessage());
                }

                System.out.println("Program continues after nested try-catch.");
            }
        }



