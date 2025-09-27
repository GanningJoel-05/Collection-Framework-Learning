package ListInterface;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList directly
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicates allowed

        // Printing ArrayList
        System.out.println("Numbers: " + numbers);

        // Access by index
        System.out.println("Element at index 1: " + numbers.get(1));

        // Updating an element
        numbers.set(2, 99); // replaces element at index 2
        System.out.println("After update: " + numbers);

        // Removing by index
        numbers.remove(1);
        System.out.println("After removing index 1: " + numbers);

        // Iterating using Iterator
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}

