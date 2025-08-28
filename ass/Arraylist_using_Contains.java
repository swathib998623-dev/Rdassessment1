import java.util.ArrayList;


   public class Arraylist_using_Contains {
    public static void main(String[] args) {

                // Create an ArrayList of Strings
                ArrayList<String> fruits = new ArrayList<>();

                // Add some elements
                fruits.add("Orange");
                fruits.add("Papaya");
                fruits.add("Mango");
                fruits.add("Apple");

                // Element to search for
                String searchFruit = "Mango";

                // Check if the element exists using contains()
                if (fruits.contains(searchFruit)) {
                    System.out.println(searchFruit + " is in the list.");
                } else {
                    System.out.println(searchFruit + " is not in the list.");
                }
            }
        }



