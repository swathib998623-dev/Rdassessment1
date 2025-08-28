import java.util.LinkedList;


public class Elements_to_Linked_list {
    public static void main(String[] args) {

                // Create a LinkedList of Strings
                LinkedList<String> animals = new LinkedList<>();

                // Add elements to the LinkedList
                animals.add("Cow");
                animals.add("Dog");
                animals.add("Elephant");
                animals.add("Cat");
                animals.add("Lion");

                System.out.println("Original LinkedList: " + animals);

                // Remove the first element
                animals.removeFirst();

                // Remove the last element
                animals.removeLast();

                // Print the updated LinkedList
                System.out.println("After removing first and last: " + animals);
            }
        }



