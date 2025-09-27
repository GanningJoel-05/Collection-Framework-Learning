package ListInterface;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // We declare it as List (interface type) and use ArrayList as implementation
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // duplicate allowed

        // Printing all elements
        System.out.println("Fruits List: " + fruits);

        // Access by index
        System.out.println("First fruit: " + fruits.getFirst());

        // Removing element
        fruits.remove("Banana"); // removes first "Banana"
        System.out.println("After removing Banana: " + fruits);

        // Iterating using for-each
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}

