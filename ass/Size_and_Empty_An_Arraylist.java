import java.util.ArrayList;

public class Size_and_Empty_An_Arraylist {
    public static void main(String[] args) {

                // Create an empty ArrayList
                ArrayList<String> items = new ArrayList<>();

                // Check size and if the list is empty
                System.out.println("Initial size: " + items.size());       // Output: 0
                System.out.println("Is the list empty? " + items.isEmpty()); // Output: true

                // Add some items to the ArrayList
                items.add("Orange");
                items.add("Papaya");

                // Check size and if the list is empty again
                System.out.println("\nAfter adding items:");
                System.out.println("Size: " + items.size());                // Output: 2
                System.out.println("Is the list empty? " + items.isEmpty()); // Output: false
            }
        }



