import java.util.ArrayList;

public class Arraylist_Intergers {
    public static void main(String[] args) {

                // Create an ArrayList of Integers
                ArrayList<Integer> numbers = new ArrayList<>();

                // Add 10 numbers to the ArrayList
                for (int i = 1; i <= 10; i++) {
                    numbers.add(i * 10); // Adds 10, 20, ..., 100
                }

                // Print the numbers using a for-each loop
                System.out.println("Numbers in the ArrayList:");
                for (int num : numbers) {
                    System.out.println(num);
                }
            }
        }


