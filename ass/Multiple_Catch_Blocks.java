public class Multiple_Catch_Blocks {
    public static void main(String[] args) {
        try {
            // Simulate a null pointer exception
                    String text = null;
                    System.out.println(text.length());  // This will throw NullPointerException

                    // Simulate arithmetic exception (unreachable in this flow, but shown for demo)
                    int a = 10;
                    int b = 0;
                    int result = a / b;  // This would throw ArithmeticException
                    System.out.println("Result: " + result);

                } catch (ArithmeticException e) {
                    System.out.println("Caught ArithmeticException: Cannot divide by zero.");
                } catch (NullPointerException e) {
                    System.out.println("Caught NullPointerException: Null object access.");
                } catch (Exception e) {
                    System.out.println("Caught General Exception: " + e.getMessage());
                }

                System.out.println("Program continues after exception handling.");
            }
        }



