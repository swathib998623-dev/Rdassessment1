import java.util.LinkedList;


public class Linked_list {
    public static void main(String[] args) {

                // Create a LinkedList of Strings
                LinkedList<String> names = new LinkedList<>();

                // Add 5 names to the LinkedList
                names.add("Swathi");
                names.add("Rajesh");
                names.add("Bhavani");
                names.add("Jyothi");
                names.add("Spoorthi");

                // Retrieve the 3rd element (index 2)
                String thirdName = names.get(2);

                // Print the 3rd name
                System.out.println("The 3rd name in the LinkedList is: " + thirdName);
            }
        }



