package map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        // create a LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(); // tight coupling - rarely used
        Map<Integer, String> map = new LinkedHashMap<>();  // loose coupling - most preferred

        // adding the elements
        map.put(5, "Rohit");
        map.put(9, "Virat");
        map.put(2, "Dhoni");
        map.put(8, "Jadeja");
        map.put(1, "Hardik");
        map.put(4, "Raina");
        map.put(null, null);
        map.put(6, null);
        System.out.println("\nThe LinkedHashMap is: \n" +map);

        // getting the elements
        System.out.println("\nThe value present in the Key-2 is: \n" +map.get(2));
        System.out.println("\nThe value present in the Key-1 is: \n" +map.get(1));
        System.out.println("\nThe value present in the Key-null is: \n" +map.get(null));
        System.out.println("\nThe value present in the Key-10 is: \n" +map.get(10));

        // updating the elements
        map.put(6, "Krunal");
        System.out.println("\nThe LinkedHashMap after updating the value is: \n" +map);
        map.put(null, "Dhawan");
        System.out.println("\nThe LinkedHashMap after updating the value is: \n" +map);
        map.put(1, "Yuvi");
        System.out.println("\nThe LinkedHashMap after updating the value is: \n" +map);

        // removing the elements
        map.remove(3);  // doesn't remove anything
        System.out.println("\nThe LinkedHashMap after removing the key-3 is: \n" +map);
        map.remove(1);
        System.out.println("\nThe LinkedHashMap after removing the key-1 is: \n" +map);
        map.remove(4, "Raina");
        System.out.println("\nThe LinkedHashMap after removing the key-4 is: \n" +map);

        // replacing the elements
        map.replace(null, "Dhawan", "Rahul");
        System.out.println("\nThe LinkedHashMap after replacing the value for key-null is: \n" +map);
        map.replace(6, "Bumrah");
        System.out.println("\nThe LinkedHashMap after replacing the value for the key-6 is: \n" +map);

        // checking for the contain key and values
        System.out.println("\nIs the 3rd key is present in the Hashmap? \n" +map.containsKey(3));
        System.out.println("\nIs the 5th key is present in the Hashmap? \n" +map.containsKey(5));
        System.out.println("\nIs the 9th key is present in the Hashmap? \n" +map.containsKey(9));
        System.out.println("\nIs the 8th key is present in the Hashmap? \n" +map.containsKey(8));

        System.out.println("\nIs the value 'Dhoni' is present in the Hashmap? \n" +map.containsValue("Dhoni"));  // Returns true - Case Sensitive
        System.out.println("\nIs the value 'DHONI' is present in the Hashmap? \n" +map.containsValue("DHONI"));  // Returns false - Case Sensitive
        System.out.println("\nIs the value 'Hardik' is present in the Hashmap? \n" +map.containsValue("Hardik"));// Removed the Element before - returns false here.
        System.out.println("\nIs the value 'Ruturaj' is present in the Hashmap? \n" +map.containsValue("Ruturaj"));    // Returns false - Value doesn't exist.

        // Printing all keys and values and key-value pairs
        System.out.println("\nThe Entire keys in the Hashmap are: \n" +map.keySet()); // prints keys alone
        System.out.println("\nThe Entire Values in the HashMap are: \n" +map.values()); // prints all the values - In collections format
        System.out.println("\nThe Entire Key-Value pairs in the HashMap are: \n" +map.entrySet()); // prints all the key-values - In collections format

        // Iterating the elements - not possible with the combination of both the keys and values together. we can do it separately for keys and values
        System.out.println("\nThe Keys in the HashMap using the enhanced for loop: ");
        for (Integer num : map.keySet()) {  // iterating keys using the enhanced for loop
            System.out.print(num + " ");
        }

        System.out.println("\n\nThe Values in the HashMap using the enhanced for loop: ");
        for (String str : map.values()) {   // iterating values using the enhanced for loop
            System.out.print(str + " ");
        }

        // HashMap Size
        System.out.println("\n\nThe size of the HashMap is: \n" +map.size());

        // Check for the empty HashMap
        System.out.println("\nIs the HashMap is Empty? \n" +map.isEmpty());

        // A way of adding the new pair which avoids the duplicates as well
        map.putIfAbsent(12, "Surya");
        System.out.println("\nThe HashMap after adding the new pair: \n" +map);

        // clearing the HashMap
        map.clear();
        System.out.println("\nThe HashMap after clearing all the elements: \n" +map);
    }
}
